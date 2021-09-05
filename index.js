var table = document.querySelector("table");


for (var i=0; i<6; i++) {
  var row = document.createElement("tr");

  for (var j=0; j<6; j++) {
    var cell = document.createElement("td");
    row.appendChild(cell);
  }

table.appendChild(row);
}
document.addEventListener("click", function(e) {
  var node = e.target;
  if (node.nodeName == "TD") { update(node); }
});

var update = function(cell) {
  cell.innerHTML += "o";
}
