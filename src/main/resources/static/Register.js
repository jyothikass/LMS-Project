const validateForm = ({password1, role, uname}) => {

    const roles = ['STUDENT', 'TEACHER','ADMIN']

    if (password1.length <= 3) return { msg: 'invalid password', sts: false }
    if (uname.length <= 2) return { msg: 'invalid user namne', sts: false }
    if ((role.length <= 2) || !roles.includes(role)) return { msg: 'invalid role', sts: false }

    return { sts: 'success', msg: 'all fields are valid' }
}

function setupForm() {

    const err = document.getElementById('errMsg')
    err.style.display = 'none'

    const formSignup = document.getElementById('signup-link')

    formSignup.onsubmit = ev => {

        ev.preventDefault()

        const formData = new FormData(ev.target)

        const user = Object.fromEntries(formData.entries())

        const { sts, msg } = validateForm(user)

        if (sts) apiSignup(user, formSignup)
        else {
            err.style.display = 'block'
            err.innerHTML = `<strong>${msg}</strong>`
        }

    }
}

setupForm()

function apiSignup(user, form) {
    const headers = {
        'content-type': 'application/json'
    }
    axios.post('http://localhost:8282/addUser', user, { headers })

        .then(res => {
            form.reset()
            showSuccessModal()
        }).catch(err => console.log(err))
}

function showSuccessModal() {
    const myModalEl = document.getElementById('successModal');
    const modal = new bootstrap.Modal(myModalEl)
    modal.show()
}

function onAgreement() {

    var agrement = document.getElementById('agreement');
    console.log(agrement.checked);
    if (agrement.checked) {
        document.getElementById('submitId').disabled = false;
    } else {
        document.getElementById('submitId').disabled = 'disabled';
    }

}
function ValidePassword() {
    var userPassword = document.getElementById('password');
    var userConfirmPassword = document.getElementById('password1');

    var userPasswordvalue = password.value;
    var userConfirmPasswordvalue = password1.value;
    console.log(userPasswordvalue);
    if (userPasswordvalue != null && userPasswordvalue != ""
        && userPasswordvalue.length > 4
        && userPasswordvalue.length < 12) {
        if (userPasswordvalue == userConfirmPasswordvalue) {
            console.log('valide both password are same');
            document.getElementById('passwordCompare').innerHTML = '';
        } else {
            console.log('valide both password are not same');
            document.getElementById('passwordCompare').innerHTML = 'Password and ConfirmPassword must be same';
        }
        console.log('valide password');
        document.getElementById('passwordError').innerHTML = '';
    } else {
        console.log('invalide password');
        document.getElementById('passwordError').innerHTML = 'Plese enter valide password';
    }
}
function showPassword() {
    var x = document.getElementById("password");
    if (x.type === "password") {
        x.type = "text";
    } else {
        x.type = "password";
    }
}