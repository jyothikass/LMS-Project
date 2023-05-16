function ValidePassword() {
    var userPassword = document.getElementById('form3Example3c');
    var userConfirmPassword = document
        .getElementById('form3Example4c');
    var userPasswordvalue = form3Example3c.value;
    var userConfirmPasswordvalue = form3Example4c.value;
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
    var x = document.getElementById("form3Example3c");
    if (x.type === "password") {
        x.type = "text";
    } else {
        x.type = "password";
    }
}
