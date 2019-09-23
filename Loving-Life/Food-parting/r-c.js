var data = '[{"id":"1","name":"早餐配"},{"id":"2","name":"午餐配"},{"id":"3","name":"晚餐配"}]';

function get_direct_select() {
    var d = eval("(" + data + ")");
    var selectValue = "";
    for (var i = 0; i < d.length; i++) {
        selectValue = $("<li id='" + d[i].id + "'><a href='#' onclick='directBtnSelect(\"" + d[i].id + "\",\"" + d[i].name + "\")'>" + d[i].name + "</a></li>")
        $(".direct").append(selectValue);
    }
}
}

function directBtnSelect(id, name) {
    $(".directText").html(name);
}

$(function () {
    get_direct_select();

});