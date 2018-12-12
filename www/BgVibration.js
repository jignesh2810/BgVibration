var exec = require('cordova/exec');



module.exports.bgvibration = function (arg0, success, error) {
    exec(success, error, 'BgVibration', 'bgvibration', [arg0]);
}
