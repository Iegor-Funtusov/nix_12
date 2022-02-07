var v = [0, 1.1, '1', "555", { name: 'Ivan'}, []];

var v1 = 1;
v1 = 'f';
function a() {  }
v1 = a();

var v2 = function (fun) {
    return function () {
        return a();
    }
}

v2(a())
