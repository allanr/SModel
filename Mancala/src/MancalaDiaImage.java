/*
 * holds dia image template. 
 * 	used by dia image generator (MancalaObjectDiagrams)
 * */


public class MancalaDiaImage {

	public String GetDiaTemplate(){
		return diaTemplate;
	}
	
	private String diaTemplate = 
		"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"+
		"<dia:diagram xmlns:dia=\"http://www.lysator.liu.se/~alla/dia/\">\n"+
		"  <dia:diagramdata>\n"+
		"    <dia:attribute name=\"background\">\n"+
		"      <dia:color val=\"#ffffff\"/>\n"+
		"    </dia:attribute>\n"+
		"    <dia:attribute name=\"pagebreak\">\n"+
		"      <dia:color val=\"#000099\"/>\n"+
		"    </dia:attribute>\n"+
		"    <dia:attribute name=\"paper\">\n"+
		"      <dia:composite type=\"paper\">\n"+
		"        <dia:attribute name=\"name\">\n"+
		"          <dia:string>#A4#</dia:string>\n"+
		"        </dia:attribute>\n"+
		"        <dia:attribute name=\"tmargin\">\n"+
		"          <dia:real val=\"2.8222000598907471\"/>\n"+
		"        </dia:attribute>\n"+
		"        <dia:attribute name=\"bmargin\">\n"+
		"          <dia:real val=\"2.8222000598907471\"/>\n"+
		"        </dia:attribute>\n"+
		"        <dia:attribute name=\"lmargin\">\n"+
		"          <dia:real val=\"2.8222000598907471\"/>\n"+
		"        </dia:attribute>\n"+
		"        <dia:attribute name=\"rmargin\">\n"+
		"          <dia:real val=\"2.8222000598907471\"/>\n"+
		"        </dia:attribute>\n"+
		"        <dia:attribute name=\"is_portrait\">\n"+
		"          <dia:boolean val=\"true\"/>\n"+
		"        </dia:attribute>\n"+
		"        <dia:attribute name=\"scaling\">\n"+
		"          <dia:real val=\"1\"/>\n"+
		"        </dia:attribute>\n"+
		"        <dia:attribute name=\"fitto\">\n"+
		"          <dia:boolean val=\"false\"/>\n"+
		"        </dia:attribute>\n"+
		"      </dia:composite>\n"+
		"    </dia:attribute>\n"+
		"    <dia:attribute name=\"grid\">\n"+
		"      <dia:composite type=\"grid\">\n"+
		"        <dia:attribute name=\"width_x\">\n"+
		"          <dia:real val=\"1\"/>\n"+
		"        </dia:attribute>\n"+
		"        <dia:attribute name=\"width_y\">\n"+
		"          <dia:real val=\"1\"/>\n"+
		"        </dia:attribute>\n"+
		"        <dia:attribute name=\"visible_x\">\n"+
		"          <dia:int val=\"1\"/>\n"+
		"        </dia:attribute>\n"+
		"        <dia:attribute name=\"visible_y\">\n"+
		"          <dia:int val=\"1\"/>\n"+
		"        </dia:attribute>\n"+
		"        <dia:composite type=\"color\"/>\n"+
		"      </dia:composite>\n"+
		"    </dia:attribute>\n"+
		"    <dia:attribute name=\"color\">\n"+
		"      <dia:color val=\"#d8e5e5\"/>\n"+
		"    </dia:attribute>\n"+
		"    <dia:attribute name=\"guides\">\n"+
		"      <dia:composite type=\"guides\">\n"+
		"        <dia:attribute name=\"hguides\"/>\n"+
		"        <dia:attribute name=\"vguides\"/>\n"+
		"      </dia:composite>\n"+
		"    </dia:attribute>\n"+
		"  </dia:diagramdata>\n"+
		"  <dia:layer name=\"Background\" visible=\"true\" active=\"true\">\n"+
		"    <dia:object type=\"Flowchart - Box\" version=\"0\" id=\"O0\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"22,28\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"21.95,27.95;27.2175,32.067\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_corner\">\n"+
		"        <dia:point val=\"22,28\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_width\">\n"+
		"        <dia:real val=\"5.1674999999999995\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_height\">\n"+
		"        <dia:real val=\"4.0170000000000012\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"show_background\">\n"+
		"        <dia:boolean val=\"true\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"padding\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"text\">\n"+
		"        <dia:composite type=\"text\">\n"+
		"          <dia:attribute name=\"string\">\n"+
		"            <dia:string>#Player\n"+
		"name: Player1#</dia:string>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"font\">\n"+
		"            <dia:font family=\"sans\" style=\"0\" name=\"Helvetica\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"height\">\n"+
		"            <dia:real val=\"0.80000000000000004\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"pos\">\n"+
		"            <dia:point val=\"24.5837,29.8485\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"color\">\n"+
		"            <dia:color val=\"#000000\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"alignment\">\n"+
		"            <dia:enum val=\"1\"/>\n"+
		"          </dia:attribute>\n"+
		"        </dia:composite>\n"+
		"      </dia:attribute>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Flowchart - Box\" version=\"0\" id=\"O1\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"14,22\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"13.95,21.95;17.05,23.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_corner\">\n"+
		"        <dia:point val=\"14,22\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_width\">\n"+
		"        <dia:real val=\"3\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_height\">\n"+
		"        <dia:real val=\"1.9000000000000001\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"show_background\">\n"+
		"        <dia:boolean val=\"true\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"padding\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"text\">\n"+
		"        <dia:composite type=\"text\">\n"+
		"          <dia:attribute name=\"string\">\n"+
		"            <dia:string>#Pit 1#</dia:string>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"font\">\n"+
		"            <dia:font family=\"sans\" style=\"0\" name=\"Helvetica\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"height\">\n"+
		"            <dia:real val=\"0.80000000000000004\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"pos\">\n"+
		"            <dia:point val=\"15.5,23.19\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"color\">\n"+
		"            <dia:color val=\"#000000\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"alignment\">\n"+
		"            <dia:enum val=\"1\"/>\n"+
		"          </dia:attribute>\n"+
		"        </dia:composite>\n"+
		"      </dia:attribute>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Flowchart - Box\" version=\"0\" id=\"O2\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"14,25\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"13.95,24.95;17.05,26.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_corner\">\n"+
		"        <dia:point val=\"14,25\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_width\">\n"+
		"        <dia:real val=\"3\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_height\">\n"+
		"        <dia:real val=\"1.9000000000000001\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"show_background\">\n"+
		"        <dia:boolean val=\"true\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"padding\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"text\">\n"+
		"        <dia:composite type=\"text\">\n"+
		"          <dia:attribute name=\"string\">\n"+
		"            <dia:string>#Pit 2#</dia:string>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"font\">\n"+
		"            <dia:font family=\"sans\" style=\"0\" name=\"Helvetica\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"height\">\n"+
		"            <dia:real val=\"0.80000000000000004\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"pos\">\n"+
		"            <dia:point val=\"15.5,26.19\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"color\">\n"+
		"            <dia:color val=\"#000000\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"alignment\">\n"+
		"            <dia:enum val=\"1\"/>\n"+
		"          </dia:attribute>\n"+
		"        </dia:composite>\n"+
		"      </dia:attribute>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Flowchart - Box\" version=\"0\" id=\"O3\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"14,28\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"13.95,27.95;17.05,29.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_corner\">\n"+
		"        <dia:point val=\"14,28\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_width\">\n"+
		"        <dia:real val=\"3\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_height\">\n"+
		"        <dia:real val=\"1.9000000000000001\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"show_background\">\n"+
		"        <dia:boolean val=\"true\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"padding\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"text\">\n"+
		"        <dia:composite type=\"text\">\n"+
		"          <dia:attribute name=\"string\">\n"+
		"            <dia:string>#Pit 3#</dia:string>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"font\">\n"+
		"            <dia:font family=\"sans\" style=\"0\" name=\"Helvetica\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"height\">\n"+
		"            <dia:real val=\"0.80000000000000004\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"pos\">\n"+
		"            <dia:point val=\"15.5,29.19\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"color\">\n"+
		"            <dia:color val=\"#000000\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"alignment\">\n"+
		"            <dia:enum val=\"1\"/>\n"+
		"          </dia:attribute>\n"+
		"        </dia:composite>\n"+
		"      </dia:attribute>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Flowchart - Box\" version=\"0\" id=\"O4\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"14,31\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"13.95,30.95;17.05,32.9936\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_corner\">\n"+
		"        <dia:point val=\"14,31\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_width\">\n"+
		"        <dia:real val=\"3\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_height\">\n"+
		"        <dia:real val=\"1.9435674545454518\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"show_background\">\n"+
		"        <dia:boolean val=\"true\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"padding\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"text\">\n"+
		"        <dia:composite type=\"text\">\n"+
		"          <dia:attribute name=\"string\">\n"+
		"            <dia:string>#Pit 4#</dia:string>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"font\">\n"+
		"            <dia:font family=\"sans\" style=\"0\" name=\"Helvetica\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"height\">\n"+
		"            <dia:real val=\"0.80000000000000004\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"pos\">\n"+
		"            <dia:point val=\"15.5,32.2118\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"color\">\n"+
		"            <dia:color val=\"#000000\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"alignment\">\n"+
		"            <dia:enum val=\"1\"/>\n"+
		"          </dia:attribute>\n"+
		"        </dia:composite>\n"+
		"      </dia:attribute>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Flowchart - Box\" version=\"0\" id=\"O5\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"14,34\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"13.95,33.95;17.05,35.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_corner\">\n"+
		"        <dia:point val=\"14,34\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_width\">\n"+
		"        <dia:real val=\"3\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_height\">\n"+
		"        <dia:real val=\"1.9000000000000001\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"show_background\">\n"+
		"        <dia:boolean val=\"true\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"padding\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"text\">\n"+
		"        <dia:composite type=\"text\">\n"+
		"          <dia:attribute name=\"string\">\n"+
		"            <dia:string>#Pit 5#</dia:string>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"font\">\n"+
		"            <dia:font family=\"sans\" style=\"0\" name=\"Helvetica\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"height\">\n"+
		"            <dia:real val=\"0.80000000000000004\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"pos\">\n"+
		"            <dia:point val=\"15.5,35.19\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"color\">\n"+
		"            <dia:color val=\"#000000\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"alignment\">\n"+
		"            <dia:enum val=\"1\"/>\n"+
		"          </dia:attribute>\n"+
		"        </dia:composite>\n"+
		"      </dia:attribute>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Flowchart - Box\" version=\"0\" id=\"O6\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"14,37\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"13.95,36.95;17.05,38.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_corner\">\n"+
		"        <dia:point val=\"14,37\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_width\">\n"+
		"        <dia:real val=\"3\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_height\">\n"+
		"        <dia:real val=\"1.9000000000000001\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"show_background\">\n"+
		"        <dia:boolean val=\"true\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"padding\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"text\">\n"+
		"        <dia:composite type=\"text\">\n"+
		"          <dia:attribute name=\"string\">\n"+
		"            <dia:string>#Pit 6#</dia:string>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"font\">\n"+
		"            <dia:font family=\"sans\" style=\"0\" name=\"Helvetica\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"height\">\n"+
		"            <dia:real val=\"0.80000000000000004\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"pos\">\n"+
		"            <dia:point val=\"15.5,38.19\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"color\">\n"+
		"            <dia:color val=\"#000000\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"alignment\">\n"+
		"            <dia:enum val=\"1\"/>\n"+
		"          </dia:attribute>\n"+
		"        </dia:composite>\n"+
		"      </dia:attribute>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Line\" version=\"0\" id=\"O7\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"15.5,23.9498\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"15.1691,23.8998;15.8309,25.062\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"conn_endpoints\">\n"+
		"        <dia:point val=\"15.5,23.9498\"/>\n"+
		"        <dia:point val=\"15.5,24.9502\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"numcp\">\n"+
		"        <dia:int val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow\">\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_length\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_width\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:connections>\n"+
		"        <dia:connection handle=\"0\" to=\"O1\" connection=\"16\"/>\n"+
		"        <dia:connection handle=\"1\" to=\"O2\" connection=\"16\"/>\n"+
		"      </dia:connections>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Line\" version=\"0\" id=\"O8\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"15.5,26.9498\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"15.1691,26.8998;15.8309,28.062\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"conn_endpoints\">\n"+
		"        <dia:point val=\"15.5,26.9498\"/>\n"+
		"        <dia:point val=\"15.5,27.9502\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"numcp\">\n"+
		"        <dia:int val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow\">\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_length\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_width\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:connections>\n"+
		"        <dia:connection handle=\"0\" to=\"O2\" connection=\"16\"/>\n"+
		"        <dia:connection handle=\"1\" to=\"O3\" connection=\"16\"/>\n"+
		"      </dia:connections>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Line\" version=\"0\" id=\"O9\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"15.5,29.9489\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"15.1691,29.8989;15.8309,31.0618\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"conn_endpoints\">\n"+
		"        <dia:point val=\"15.5,29.9489\"/>\n"+
		"        <dia:point val=\"15.5,30.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"numcp\">\n"+
		"        <dia:int val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow\">\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_length\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_width\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:connections>\n"+
		"        <dia:connection handle=\"0\" to=\"O3\" connection=\"16\"/>\n"+
		"        <dia:connection handle=\"1\" to=\"O4\" connection=\"16\"/>\n"+
		"      </dia:connections>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Line\" version=\"0\" id=\"O10\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"15.5,35.9498\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"15.1691,35.8998;15.8309,37.062\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"conn_endpoints\">\n"+
		"        <dia:point val=\"15.5,35.9498\"/>\n"+
		"        <dia:point val=\"15.5,36.9502\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"numcp\">\n"+
		"        <dia:int val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow\">\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_length\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_width\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:connections>\n"+
		"        <dia:connection handle=\"0\" to=\"O5\" connection=\"16\"/>\n"+
		"        <dia:connection handle=\"1\" to=\"O6\" connection=\"16\"/>\n"+
		"      </dia:connections>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Flowchart - Box\" version=\"0\" id=\"O11\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"14,40\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"13.95,39.95;17.05,41.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_corner\">\n"+
		"        <dia:point val=\"14,40\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_width\">\n"+
		"        <dia:real val=\"3\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_height\">\n"+
		"        <dia:real val=\"1.9000000000000004\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"show_background\">\n"+
		"        <dia:boolean val=\"true\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"padding\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"text\">\n"+
		"        <dia:composite type=\"text\">\n"+
		"          <dia:attribute name=\"string\">\n"+
		"            <dia:string>#Store#</dia:string>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"font\">\n"+
		"            <dia:font family=\"sans\" style=\"0\" name=\"Helvetica\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"height\">\n"+
		"            <dia:real val=\"0.80000000000000004\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"pos\">\n"+
		"            <dia:point val=\"15.5,41.19\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"color\">\n"+
		"            <dia:color val=\"#000000\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"alignment\">\n"+
		"            <dia:enum val=\"1\"/>\n"+
		"          </dia:attribute>\n"+
		"        </dia:composite>\n"+
		"      </dia:attribute>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Line\" version=\"0\" id=\"O12\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"15.5,38.9498\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"15.1691,38.8998;15.8309,40.062\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"conn_endpoints\">\n"+
		"        <dia:point val=\"15.5,38.9498\"/>\n"+
		"        <dia:point val=\"15.5,39.9502\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"numcp\">\n"+
		"        <dia:int val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow\">\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_length\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_width\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:connections>\n"+
		"        <dia:connection handle=\"0\" to=\"O6\" connection=\"16\"/>\n"+
		"        <dia:connection handle=\"1\" to=\"O11\" connection=\"16\"/>\n"+
		"      </dia:connections>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Text\" version=\"1\" id=\"O13\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"4,20\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"4,19.36;8.3025,20.1325\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"text\">\n"+
		"        <dia:composite type=\"text\">\n"+
		"          <dia:attribute name=\"string\">\n"+
		"            <dia:string>#$CONDITION#</dia:string>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"font\">\n"+
		"            <dia:font family=\"sans\" style=\"80\" name=\"Helvetica-Bold\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"height\">\n"+
		"            <dia:real val=\"0.80000000000000004\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"pos\">\n"+
		"            <dia:point val=\"4,20\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"color\">\n"+
		"            <dia:color val=\"#000000\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"alignment\">\n"+
		"            <dia:enum val=\"0\"/>\n"+
		"          </dia:attribute>\n"+
		"        </dia:composite>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"valign\">\n"+
		"        <dia:enum val=\"3\"/>\n"+
		"      </dia:attribute>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Text\" version=\"1\" id=\"O14\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"4,18\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"4,17.36;13.9775,18.1325\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"text\">\n"+
		"        <dia:composite type=\"text\">\n"+
		"          <dia:attribute name=\"string\">\n"+
		"            <dia:string>#USERSTORY $USERSTORYNUM#</dia:string>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"font\">\n"+
		"            <dia:font family=\"sans\" style=\"80\" name=\"Helvetica-Bold\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"height\">\n"+
		"            <dia:real val=\"0.80000000000000004\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"pos\">\n"+
		"            <dia:point val=\"4,18\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"color\">\n"+
		"            <dia:color val=\"#000000\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"alignment\">\n"+
		"            <dia:enum val=\"0\"/>\n"+
		"          </dia:attribute>\n"+
		"        </dia:composite>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"valign\">\n"+
		"        <dia:enum val=\"3\"/>\n"+
		"      </dia:attribute>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Text\" version=\"1\" id=\"O15\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"5.9,17.3035\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"5.9,16.6635;5.9,17.436\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"text\">\n"+
		"        <dia:composite type=\"text\">\n"+
		"          <dia:attribute name=\"string\">\n"+
		"            <dia:string>##</dia:string>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"font\">\n"+
		"            <dia:font family=\"sans\" style=\"0\" name=\"Helvetica\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"height\">\n"+
		"            <dia:real val=\"0.80000000000000004\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"pos\">\n"+
		"            <dia:point val=\"5.9,17.3035\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"color\">\n"+
		"            <dia:color val=\"#000000\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"alignment\">\n"+
		"            <dia:enum val=\"0\"/>\n"+
		"          </dia:attribute>\n"+
		"        </dia:composite>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"valign\">\n"+
		"        <dia:enum val=\"3\"/>\n"+
		"      </dia:attribute>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - ZigZagLine\" version=\"1\" id=\"O16\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"22,30.0085\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"16.8882,22.6191;22.05,30.0585\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"orth_points\">\n"+
		"        <dia:point val=\"22,30.0085\"/>\n"+
		"        <dia:point val=\"19.5,30.0085\"/>\n"+
		"        <dia:point val=\"19.5,22.95\"/>\n"+
		"        <dia:point val=\"17,22.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"orth_orient\">\n"+
		"        <dia:enum val=\"0\"/>\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"        <dia:enum val=\"0\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"autorouting\">\n"+
		"        <dia:boolean val=\"true\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow\">\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_length\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_width\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:connections>\n"+
		"        <dia:connection handle=\"0\" to=\"O0\" connection=\"7\"/>\n"+
		"        <dia:connection handle=\"1\" to=\"O1\" connection=\"8\"/>\n"+
		"      </dia:connections>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - ZigZagLine\" version=\"1\" id=\"O17\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"22,30.0085\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"16.8882,28.6191;22.05,30.0585\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"orth_points\">\n"+
		"        <dia:point val=\"22,30.0085\"/>\n"+
		"        <dia:point val=\"19.5,30.0085\"/>\n"+
		"        <dia:point val=\"19.5,28.95\"/>\n"+
		"        <dia:point val=\"17,28.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"orth_orient\">\n"+
		"        <dia:enum val=\"0\"/>\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"        <dia:enum val=\"0\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"autorouting\">\n"+
		"        <dia:boolean val=\"true\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow\">\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_length\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_width\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:connections>\n"+
		"        <dia:connection handle=\"0\" to=\"O0\" connection=\"7\"/>\n"+
		"        <dia:connection handle=\"1\" to=\"O3\" connection=\"8\"/>\n"+
		"      </dia:connections>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - ZigZagLine\" version=\"1\" id=\"O18\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"22,30.0085\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"16.8882,29.9585;22.05,38.2809\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"orth_points\">\n"+
		"        <dia:point val=\"22,30.0085\"/>\n"+
		"        <dia:point val=\"19.5,30.0085\"/>\n"+
		"        <dia:point val=\"19.5,37.95\"/>\n"+
		"        <dia:point val=\"17,37.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"orth_orient\">\n"+
		"        <dia:enum val=\"0\"/>\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"        <dia:enum val=\"0\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"autorouting\">\n"+
		"        <dia:boolean val=\"true\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow\">\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_length\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_width\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:connections>\n"+
		"        <dia:connection handle=\"0\" to=\"O0\" connection=\"7\"/>\n"+
		"        <dia:connection handle=\"1\" to=\"O6\" connection=\"8\"/>\n"+
		"      </dia:connections>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - ZigZagLine\" version=\"1\" id=\"O19\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"22,30.0085\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"16.8882,29.9585;22.05,41.2809\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"orth_points\">\n"+
		"        <dia:point val=\"22,30.0085\"/>\n"+
		"        <dia:point val=\"19.5,30.0085\"/>\n"+
		"        <dia:point val=\"19.5,40.95\"/>\n"+
		"        <dia:point val=\"17,40.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"orth_orient\">\n"+
		"        <dia:enum val=\"0\"/>\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"        <dia:enum val=\"0\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"autorouting\">\n"+
		"        <dia:boolean val=\"true\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow\">\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_length\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_width\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:connections>\n"+
		"        <dia:connection handle=\"0\" to=\"O0\" connection=\"7\"/>\n"+
		"        <dia:connection handle=\"1\" to=\"O11\" connection=\"8\"/>\n"+
		"      </dia:connections>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - ZigZagLine\" version=\"1\" id=\"O20\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"22,30.0085\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"16.8882,29.9585;22.05,32.3027\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"orth_points\">\n"+
		"        <dia:point val=\"22,30.0085\"/>\n"+
		"        <dia:point val=\"19.5,30.0085\"/>\n"+
		"        <dia:point val=\"19.5,31.9718\"/>\n"+
		"        <dia:point val=\"17,31.9718\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"orth_orient\">\n"+
		"        <dia:enum val=\"0\"/>\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"        <dia:enum val=\"0\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"autorouting\">\n"+
		"        <dia:boolean val=\"true\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow\">\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_length\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_width\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:connections>\n"+
		"        <dia:connection handle=\"0\" to=\"O0\" connection=\"7\"/>\n"+
		"        <dia:connection handle=\"1\" to=\"O4\" connection=\"8\"/>\n"+
		"      </dia:connections>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - ZigZagLine\" version=\"1\" id=\"O21\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"22,30.0085\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"16.8882,29.9585;22.05,35.2809\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"orth_points\">\n"+
		"        <dia:point val=\"22,30.0085\"/>\n"+
		"        <dia:point val=\"19.5,30.0085\"/>\n"+
		"        <dia:point val=\"19.5,34.95\"/>\n"+
		"        <dia:point val=\"17,34.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"orth_orient\">\n"+
		"        <dia:enum val=\"0\"/>\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"        <dia:enum val=\"0\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"autorouting\">\n"+
		"        <dia:boolean val=\"true\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow\">\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_length\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_width\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:connections>\n"+
		"        <dia:connection handle=\"0\" to=\"O0\" connection=\"7\"/>\n"+
		"        <dia:connection handle=\"1\" to=\"O5\" connection=\"8\"/>\n"+
		"      </dia:connections>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Text\" version=\"1\" id=\"O22\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"19.95,29.525\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"19.95,28.885;21.125,29.6575\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"text\">\n"+
		"        <dia:composite type=\"text\">\n"+
		"          <dia:attribute name=\"string\">\n"+
		"            <dia:string>#HAS#</dia:string>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"font\">\n"+
		"            <dia:font family=\"sans\" style=\"0\" name=\"Helvetica\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"height\">\n"+
		"            <dia:real val=\"0.80000000000000004\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"pos\">\n"+
		"            <dia:point val=\"19.95,29.525\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"color\">\n"+
		"            <dia:color val=\"#000000\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"alignment\">\n"+
		"            <dia:enum val=\"0\"/>\n"+
		"          </dia:attribute>\n"+
		"        </dia:composite>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"valign\">\n"+
		"        <dia:enum val=\"3\"/>\n"+
		"      </dia:attribute>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Text\" version=\"1\" id=\"O23\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"11,23\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"11,22.36;11,23.1325\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"text\">\n"+
		"        <dia:composite type=\"text\">\n"+
		"          <dia:attribute name=\"string\">\n"+
		"            <dia:string>##</dia:string>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"font\">\n"+
		"            <dia:font family=\"sans\" style=\"0\" name=\"Helvetica\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"height\">\n"+
		"            <dia:real val=\"0.80000000000000004\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"pos\">\n"+
		"            <dia:point val=\"11,23\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"color\">\n"+
		"            <dia:color val=\"#000000\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"alignment\">\n"+
		"            <dia:enum val=\"0\"/>\n"+
		"          </dia:attribute>\n"+
		"        </dia:composite>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"valign\">\n"+
		"        <dia:enum val=\"3\"/>\n"+
		"      </dia:attribute>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - ZigZagLine\" version=\"1\" id=\"O24\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"22,30.0085\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"16.8882,25.6191;22.05,30.0585\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"orth_points\">\n"+
		"        <dia:point val=\"22,30.0085\"/>\n"+
		"        <dia:point val=\"19.5,30.0085\"/>\n"+
		"        <dia:point val=\"19.5,25.95\"/>\n"+
		"        <dia:point val=\"17,25.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"orth_orient\">\n"+
		"        <dia:enum val=\"0\"/>\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"        <dia:enum val=\"0\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"autorouting\">\n"+
		"        <dia:boolean val=\"true\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow\">\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_length\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_width\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:connections>\n"+
		"        <dia:connection handle=\"0\" to=\"O0\" connection=\"7\"/>\n"+
		"        <dia:connection handle=\"1\" to=\"O2\" connection=\"8\"/>\n"+
		"      </dia:connections>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Flowchart - Box\" version=\"0\" id=\"O25\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"7,22\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"6.95,21.95;11.05,23.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_corner\">\n"+
		"        <dia:point val=\"7,22\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_width\">\n"+
		"        <dia:real val=\"4\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_height\">\n"+
		"        <dia:real val=\"1.9000000000000001\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"show_background\">\n"+
		"        <dia:boolean val=\"true\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"padding\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"text\">\n"+
		"        <dia:composite type=\"text\">\n"+
		"          <dia:attribute name=\"string\">\n"+
		"            <dia:string>#$SN_1_1#</dia:string>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"font\">\n"+
		"            <dia:font family=\"sans\" style=\"0\" name=\"Helvetica\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"height\">\n"+
		"            <dia:real val=\"0.80000000000000004\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"pos\">\n"+
		"            <dia:point val=\"9,23.19\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"color\">\n"+
		"            <dia:color val=\"#000000\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"alignment\">\n"+
		"            <dia:enum val=\"1\"/>\n"+
		"          </dia:attribute>\n"+
		"        </dia:composite>\n"+
		"      </dia:attribute>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Flowchart - Box\" version=\"0\" id=\"O26\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"7,25\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"6.95,24.95;11.05,26.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_corner\">\n"+
		"        <dia:point val=\"7,25\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_width\">\n"+
		"        <dia:real val=\"4\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_height\">\n"+
		"        <dia:real val=\"1.9000000000000001\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"show_background\">\n"+
		"        <dia:boolean val=\"true\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"padding\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"text\">\n"+
		"        <dia:composite type=\"text\">\n"+
		"          <dia:attribute name=\"string\">\n"+
		"            <dia:string>#$SN_1_2#</dia:string>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"font\">\n"+
		"            <dia:font family=\"sans\" style=\"0\" name=\"Helvetica\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"height\">\n"+
		"            <dia:real val=\"0.80000000000000004\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"pos\">\n"+
		"            <dia:point val=\"9,26.19\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"color\">\n"+
		"            <dia:color val=\"#000000\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"alignment\">\n"+
		"            <dia:enum val=\"1\"/>\n"+
		"          </dia:attribute>\n"+
		"        </dia:composite>\n"+
		"      </dia:attribute>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Flowchart - Box\" version=\"0\" id=\"O27\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"7,28\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"6.95,27.95;11.05,29.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_corner\">\n"+
		"        <dia:point val=\"7,28\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_width\">\n"+
		"        <dia:real val=\"4\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_height\">\n"+
		"        <dia:real val=\"1.9000000000000001\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"show_background\">\n"+
		"        <dia:boolean val=\"true\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"padding\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"text\">\n"+
		"        <dia:composite type=\"text\">\n"+
		"          <dia:attribute name=\"string\">\n"+
		"            <dia:string>#$SN_1_3#</dia:string>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"font\">\n"+
		"            <dia:font family=\"sans\" style=\"0\" name=\"Helvetica\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"height\">\n"+
		"            <dia:real val=\"0.80000000000000004\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"pos\">\n"+
		"            <dia:point val=\"9,29.19\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"color\">\n"+
		"            <dia:color val=\"#000000\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"alignment\">\n"+
		"            <dia:enum val=\"1\"/>\n"+
		"          </dia:attribute>\n"+
		"        </dia:composite>\n"+
		"      </dia:attribute>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Flowchart - Box\" version=\"0\" id=\"O28\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"7,31\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"6.95,30.95;11.05,32.9936\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_corner\">\n"+
		"        <dia:point val=\"7,31\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_width\">\n"+
		"        <dia:real val=\"4\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_height\">\n"+
		"        <dia:real val=\"1.9435674545454518\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"show_background\">\n"+
		"        <dia:boolean val=\"true\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"padding\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"text\">\n"+
		"        <dia:composite type=\"text\">\n"+
		"          <dia:attribute name=\"string\">\n"+
		"            <dia:string>#$SN_1_4#</dia:string>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"font\">\n"+
		"            <dia:font family=\"sans\" style=\"0\" name=\"Helvetica\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"height\">\n"+
		"            <dia:real val=\"0.80000000000000004\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"pos\">\n"+
		"            <dia:point val=\"9,32.2118\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"color\">\n"+
		"            <dia:color val=\"#000000\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"alignment\">\n"+
		"            <dia:enum val=\"1\"/>\n"+
		"          </dia:attribute>\n"+
		"        </dia:composite>\n"+
		"      </dia:attribute>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Flowchart - Box\" version=\"0\" id=\"O29\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"7,34\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"6.95,33.95;11.05,35.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_corner\">\n"+
		"        <dia:point val=\"7,34\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_width\">\n"+
		"        <dia:real val=\"4\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_height\">\n"+
		"        <dia:real val=\"1.9000000000000001\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"show_background\">\n"+
		"        <dia:boolean val=\"true\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"padding\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"text\">\n"+
		"        <dia:composite type=\"text\">\n"+
		"          <dia:attribute name=\"string\">\n"+
		"            <dia:string>#$SN_1_5#</dia:string>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"font\">\n"+
		"            <dia:font family=\"sans\" style=\"0\" name=\"Helvetica\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"height\">\n"+
		"            <dia:real val=\"0.80000000000000004\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"pos\">\n"+
		"            <dia:point val=\"9,35.19\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"color\">\n"+
		"            <dia:color val=\"#000000\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"alignment\">\n"+
		"            <dia:enum val=\"1\"/>\n"+
		"          </dia:attribute>\n"+
		"        </dia:composite>\n"+
		"      </dia:attribute>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Flowchart - Box\" version=\"0\" id=\"O30\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"7,37\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"6.95,36.95;11.05,38.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_corner\">\n"+
		"        <dia:point val=\"7,37\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_width\">\n"+
		"        <dia:real val=\"4\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_height\">\n"+
		"        <dia:real val=\"1.9000000000000001\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"show_background\">\n"+
		"        <dia:boolean val=\"true\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"padding\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"text\">\n"+
		"        <dia:composite type=\"text\">\n"+
		"          <dia:attribute name=\"string\">\n"+
		"            <dia:string>#$SN_1_6#</dia:string>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"font\">\n"+
		"            <dia:font family=\"sans\" style=\"0\" name=\"Helvetica\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"height\">\n"+
		"            <dia:real val=\"0.80000000000000004\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"pos\">\n"+
		"            <dia:point val=\"9,38.19\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"color\">\n"+
		"            <dia:color val=\"#000000\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"alignment\">\n"+
		"            <dia:enum val=\"1\"/>\n"+
		"          </dia:attribute>\n"+
		"        </dia:composite>\n"+
		"      </dia:attribute>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Flowchart - Box\" version=\"0\" id=\"O31\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"7,40\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"6.95,39.95;11.05,41.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_corner\">\n"+
		"        <dia:point val=\"7,40\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_width\">\n"+
		"        <dia:real val=\"4\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_height\">\n"+
		"        <dia:real val=\"1.9000000000000004\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"show_background\">\n"+
		"        <dia:boolean val=\"true\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"padding\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"text\">\n"+
		"        <dia:composite type=\"text\">\n"+
		"          <dia:attribute name=\"string\">\n"+
		"            <dia:string>#$SN_1_S#</dia:string>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"font\">\n"+
		"            <dia:font family=\"sans\" style=\"0\" name=\"Helvetica\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"height\">\n"+
		"            <dia:real val=\"0.80000000000000004\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"pos\">\n"+
		"            <dia:point val=\"9,41.19\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"color\">\n"+
		"            <dia:color val=\"#000000\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"alignment\">\n"+
		"            <dia:enum val=\"1\"/>\n"+
		"          </dia:attribute>\n"+
		"        </dia:composite>\n"+
		"      </dia:attribute>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Line\" version=\"0\" id=\"O32\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"15.5,32.9436\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"15.1691,32.8936;15.8309,34.1118\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"conn_endpoints\">\n"+
		"        <dia:point val=\"15.5,32.9436\"/>\n"+
		"        <dia:point val=\"15.5,34\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"numcp\">\n"+
		"        <dia:int val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow\">\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_length\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_width\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:connections>\n"+
		"        <dia:connection handle=\"0\" to=\"O4\" connection=\"13\"/>\n"+
		"        <dia:connection handle=\"1\" to=\"O5\" connection=\"2\"/>\n"+
		"      </dia:connections>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Line\" version=\"0\" id=\"O33\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"14,22.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"10.8882,22.6191;14.05,23.2809\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"conn_endpoints\">\n"+
		"        <dia:point val=\"14,22.95\"/>\n"+
		"        <dia:point val=\"11,22.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"numcp\">\n"+
		"        <dia:int val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow\">\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_length\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_width\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:connections>\n"+
		"        <dia:connection handle=\"0\" to=\"O1\" connection=\"7\"/>\n"+
		"        <dia:connection handle=\"1\" to=\"O25\" connection=\"8\"/>\n"+
		"      </dia:connections>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Line\" version=\"0\" id=\"O34\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"14,25.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"10.8882,25.6191;14.05,26.2809\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"conn_endpoints\">\n"+
		"        <dia:point val=\"14,25.95\"/>\n"+
		"        <dia:point val=\"11,25.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"numcp\">\n"+
		"        <dia:int val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow\">\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_length\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_width\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:connections>\n"+
		"        <dia:connection handle=\"0\" to=\"O2\" connection=\"7\"/>\n"+
		"        <dia:connection handle=\"1\" to=\"O26\" connection=\"8\"/>\n"+
		"      </dia:connections>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Line\" version=\"0\" id=\"O35\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"14,28.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"10.8882,28.6191;14.05,29.2809\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"conn_endpoints\">\n"+
		"        <dia:point val=\"14,28.95\"/>\n"+
		"        <dia:point val=\"11,28.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"numcp\">\n"+
		"        <dia:int val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow\">\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_length\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_width\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:connections>\n"+
		"        <dia:connection handle=\"0\" to=\"O3\" connection=\"7\"/>\n"+
		"        <dia:connection handle=\"1\" to=\"O27\" connection=\"8\"/>\n"+
		"      </dia:connections>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Line\" version=\"0\" id=\"O36\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"14,31.9718\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"10.8882,31.6409;14.05,32.3027\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"conn_endpoints\">\n"+
		"        <dia:point val=\"14,31.9718\"/>\n"+
		"        <dia:point val=\"11,31.9718\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"numcp\">\n"+
		"        <dia:int val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow\">\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_length\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_width\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:connections>\n"+
		"        <dia:connection handle=\"0\" to=\"O4\" connection=\"7\"/>\n"+
		"        <dia:connection handle=\"1\" to=\"O28\" connection=\"8\"/>\n"+
		"      </dia:connections>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Line\" version=\"0\" id=\"O37\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"14,34.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"10.8882,34.6191;14.05,35.2809\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"conn_endpoints\">\n"+
		"        <dia:point val=\"14,34.95\"/>\n"+
		"        <dia:point val=\"11,34.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"numcp\">\n"+
		"        <dia:int val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow\">\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_length\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_width\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:connections>\n"+
		"        <dia:connection handle=\"0\" to=\"O5\" connection=\"7\"/>\n"+
		"        <dia:connection handle=\"1\" to=\"O29\" connection=\"8\"/>\n"+
		"      </dia:connections>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Line\" version=\"0\" id=\"O38\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"14,37.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"10.8882,37.6191;14.05,38.2809\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"conn_endpoints\">\n"+
		"        <dia:point val=\"14,37.95\"/>\n"+
		"        <dia:point val=\"11,37.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"numcp\">\n"+
		"        <dia:int val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow\">\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_length\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_width\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:connections>\n"+
		"        <dia:connection handle=\"0\" to=\"O6\" connection=\"7\"/>\n"+
		"        <dia:connection handle=\"1\" to=\"O30\" connection=\"8\"/>\n"+
		"      </dia:connections>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Line\" version=\"0\" id=\"O39\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"14,40.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"10.8882,40.6191;14.05,41.2809\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"conn_endpoints\">\n"+
		"        <dia:point val=\"14,40.95\"/>\n"+
		"        <dia:point val=\"11,40.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"numcp\">\n"+
		"        <dia:int val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow\">\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_length\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_width\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:connections>\n"+
		"        <dia:connection handle=\"0\" to=\"O11\" connection=\"7\"/>\n"+
		"        <dia:connection handle=\"1\" to=\"O31\" connection=\"8\"/>\n"+
		"      </dia:connections>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Text\" version=\"1\" id=\"O40\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"12,22\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"12,21.36;12.9775,22.1325\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"text\">\n"+
		"        <dia:composite type=\"text\">\n"+
		"          <dia:attribute name=\"string\">\n"+
		"            <dia:string>#has#</dia:string>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"font\">\n"+
		"            <dia:font family=\"sans\" style=\"0\" name=\"Helvetica\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"height\">\n"+
		"            <dia:real val=\"0.80000000000000004\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"pos\">\n"+
		"            <dia:point val=\"12,22\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"color\">\n"+
		"            <dia:color val=\"#000000\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"alignment\">\n"+
		"            <dia:enum val=\"0\"/>\n"+
		"          </dia:attribute>\n"+
		"        </dia:composite>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"valign\">\n"+
		"        <dia:enum val=\"3\"/>\n"+
		"      </dia:attribute>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Text\" version=\"1\" id=\"O41\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"12,25\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"12,24.36;12.9775,25.1325\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"text\">\n"+
		"        <dia:composite type=\"text\">\n"+
		"          <dia:attribute name=\"string\">\n"+
		"            <dia:string>#has#</dia:string>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"font\">\n"+
		"            <dia:font family=\"sans\" style=\"0\" name=\"Helvetica\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"height\">\n"+
		"            <dia:real val=\"0.80000000000000004\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"pos\">\n"+
		"            <dia:point val=\"12,25\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"color\">\n"+
		"            <dia:color val=\"#000000\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"alignment\">\n"+
		"            <dia:enum val=\"0\"/>\n"+
		"          </dia:attribute>\n"+
		"        </dia:composite>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"valign\">\n"+
		"        <dia:enum val=\"3\"/>\n"+
		"      </dia:attribute>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Text\" version=\"1\" id=\"O42\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"12,28\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"12,27.36;12.9775,28.1325\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"text\">\n"+
		"        <dia:composite type=\"text\">\n"+
		"          <dia:attribute name=\"string\">\n"+
		"            <dia:string>#has#</dia:string>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"font\">\n"+
		"            <dia:font family=\"sans\" style=\"0\" name=\"Helvetica\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"height\">\n"+
		"            <dia:real val=\"0.80000000000000004\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"pos\">\n"+
		"            <dia:point val=\"12,28\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"color\">\n"+
		"            <dia:color val=\"#000000\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"alignment\">\n"+
		"            <dia:enum val=\"0\"/>\n"+
		"          </dia:attribute>\n"+
		"        </dia:composite>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"valign\">\n"+
		"        <dia:enum val=\"3\"/>\n"+
		"      </dia:attribute>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Text\" version=\"1\" id=\"O43\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"12,31\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"12,30.36;12.9775,31.1325\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"text\">\n"+
		"        <dia:composite type=\"text\">\n"+
		"          <dia:attribute name=\"string\">\n"+
		"            <dia:string>#has#</dia:string>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"font\">\n"+
		"            <dia:font family=\"sans\" style=\"0\" name=\"Helvetica\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"height\">\n"+
		"            <dia:real val=\"0.80000000000000004\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"pos\">\n"+
		"            <dia:point val=\"12,31\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"color\">\n"+
		"            <dia:color val=\"#000000\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"alignment\">\n"+
		"            <dia:enum val=\"0\"/>\n"+
		"          </dia:attribute>\n"+
		"        </dia:composite>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"valign\">\n"+
		"        <dia:enum val=\"3\"/>\n"+
		"      </dia:attribute>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Text\" version=\"1\" id=\"O44\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"12,34\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"12,33.36;12.9775,34.1325\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"text\">\n"+
		"        <dia:composite type=\"text\">\n"+
		"          <dia:attribute name=\"string\">\n"+
		"            <dia:string>#has#</dia:string>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"font\">\n"+
		"            <dia:font family=\"sans\" style=\"0\" name=\"Helvetica\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"height\">\n"+
		"            <dia:real val=\"0.80000000000000004\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"pos\">\n"+
		"            <dia:point val=\"12,34\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"color\">\n"+
		"            <dia:color val=\"#000000\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"alignment\">\n"+
		"            <dia:enum val=\"0\"/>\n"+
		"          </dia:attribute>\n"+
		"        </dia:composite>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"valign\">\n"+
		"        <dia:enum val=\"3\"/>\n"+
		"      </dia:attribute>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Text\" version=\"1\" id=\"O45\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"12,37\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"12,36.36;12.9775,37.1325\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"text\">\n"+
		"        <dia:composite type=\"text\">\n"+
		"          <dia:attribute name=\"string\">\n"+
		"            <dia:string>#has#</dia:string>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"font\">\n"+
		"            <dia:font family=\"sans\" style=\"0\" name=\"Helvetica\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"height\">\n"+
		"            <dia:real val=\"0.80000000000000004\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"pos\">\n"+
		"            <dia:point val=\"12,37\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"color\">\n"+
		"            <dia:color val=\"#000000\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"alignment\">\n"+
		"            <dia:enum val=\"0\"/>\n"+
		"          </dia:attribute>\n"+
		"        </dia:composite>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"valign\">\n"+
		"        <dia:enum val=\"3\"/>\n"+
		"      </dia:attribute>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Text\" version=\"1\" id=\"O46\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"12,40\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"12,39.36;12.9775,40.1325\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"text\">\n"+
		"        <dia:composite type=\"text\">\n"+
		"          <dia:attribute name=\"string\">\n"+
		"            <dia:string>#has#</dia:string>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"font\">\n"+
		"            <dia:font family=\"sans\" style=\"0\" name=\"Helvetica\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"height\">\n"+
		"            <dia:real val=\"0.80000000000000004\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"pos\">\n"+
		"            <dia:point val=\"12,40\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"color\">\n"+
		"            <dia:color val=\"#000000\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"alignment\">\n"+
		"            <dia:enum val=\"0\"/>\n"+
		"          </dia:attribute>\n"+
		"        </dia:composite>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"valign\">\n"+
		"        <dia:enum val=\"3\"/>\n"+
		"      </dia:attribute>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Flowchart - Box\" version=\"0\" id=\"O47\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"32,28\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"31.95,27.95;37.2175,32.05\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_corner\">\n"+
		"        <dia:point val=\"32,28\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_width\">\n"+
		"        <dia:real val=\"5.1674999999999995\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_height\">\n"+
		"        <dia:real val=\"4\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"show_background\">\n"+
		"        <dia:boolean val=\"true\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"padding\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"text\">\n"+
		"        <dia:composite type=\"text\">\n"+
		"          <dia:attribute name=\"string\">\n"+
		"            <dia:string>#Player\n"+
		"name: Player2#</dia:string>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"font\">\n"+
		"            <dia:font family=\"sans\" style=\"0\" name=\"Helvetica\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"height\">\n"+
		"            <dia:real val=\"0.80000000000000004\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"pos\">\n"+
		"            <dia:point val=\"34.5838,29.84\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"color\">\n"+
		"            <dia:color val=\"#000000\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"alignment\">\n"+
		"            <dia:enum val=\"1\"/>\n"+
		"          </dia:attribute>\n"+
		"        </dia:composite>\n"+
		"      </dia:attribute>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Flowchart - Box\" version=\"0\" id=\"O48\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"41,22\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"40.95,21.95;44.05,23.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_corner\">\n"+
		"        <dia:point val=\"41,22\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_width\">\n"+
		"        <dia:real val=\"3\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_height\">\n"+
		"        <dia:real val=\"1.9000000000000001\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"show_background\">\n"+
		"        <dia:boolean val=\"true\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"padding\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"text\">\n"+
		"        <dia:composite type=\"text\">\n"+
		"          <dia:attribute name=\"string\">\n"+
		"            <dia:string>#Store#</dia:string>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"font\">\n"+
		"            <dia:font family=\"sans\" style=\"0\" name=\"Helvetica\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"height\">\n"+
		"            <dia:real val=\"0.80000000000000004\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"pos\">\n"+
		"            <dia:point val=\"42.5,23.19\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"color\">\n"+
		"            <dia:color val=\"#000000\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"alignment\">\n"+
		"            <dia:enum val=\"1\"/>\n"+
		"          </dia:attribute>\n"+
		"        </dia:composite>\n"+
		"      </dia:attribute>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Flowchart - Box\" version=\"0\" id=\"O49\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"41,25\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"40.95,24.95;44.05,26.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_corner\">\n"+
		"        <dia:point val=\"41,25\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_width\">\n"+
		"        <dia:real val=\"3\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_height\">\n"+
		"        <dia:real val=\"1.9000000000000001\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"show_background\">\n"+
		"        <dia:boolean val=\"true\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"padding\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"text\">\n"+
		"        <dia:composite type=\"text\">\n"+
		"          <dia:attribute name=\"string\">\n"+
		"            <dia:string>#Pit 6#</dia:string>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"font\">\n"+
		"            <dia:font family=\"sans\" style=\"0\" name=\"Helvetica\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"height\">\n"+
		"            <dia:real val=\"0.80000000000000004\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"pos\">\n"+
		"            <dia:point val=\"42.5,26.19\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"color\">\n"+
		"            <dia:color val=\"#000000\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"alignment\">\n"+
		"            <dia:enum val=\"1\"/>\n"+
		"          </dia:attribute>\n"+
		"        </dia:composite>\n"+
		"      </dia:attribute>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Flowchart - Box\" version=\"0\" id=\"O50\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"41,28\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"40.95,27.95;44.05,29.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_corner\">\n"+
		"        <dia:point val=\"41,28\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_width\">\n"+
		"        <dia:real val=\"3\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_height\">\n"+
		"        <dia:real val=\"1.9000000000000001\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"show_background\">\n"+
		"        <dia:boolean val=\"true\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"padding\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"text\">\n"+
		"        <dia:composite type=\"text\">\n"+
		"          <dia:attribute name=\"string\">\n"+
		"            <dia:string>#Pit 5#</dia:string>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"font\">\n"+
		"            <dia:font family=\"sans\" style=\"0\" name=\"Helvetica\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"height\">\n"+
		"            <dia:real val=\"0.80000000000000004\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"pos\">\n"+
		"            <dia:point val=\"42.5,29.19\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"color\">\n"+
		"            <dia:color val=\"#000000\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"alignment\">\n"+
		"            <dia:enum val=\"1\"/>\n"+
		"          </dia:attribute>\n"+
		"        </dia:composite>\n"+
		"      </dia:attribute>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Flowchart - Box\" version=\"0\" id=\"O51\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"41,31\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"40.95,30.95;44.05,32.9936\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_corner\">\n"+
		"        <dia:point val=\"41,31\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_width\">\n"+
		"        <dia:real val=\"3\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_height\">\n"+
		"        <dia:real val=\"1.9435674545454518\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"show_background\">\n"+
		"        <dia:boolean val=\"true\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"padding\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"text\">\n"+
		"        <dia:composite type=\"text\">\n"+
		"          <dia:attribute name=\"string\">\n"+
		"            <dia:string>#Pit 4#</dia:string>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"font\">\n"+
		"            <dia:font family=\"sans\" style=\"0\" name=\"Helvetica\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"height\">\n"+
		"            <dia:real val=\"0.80000000000000004\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"pos\">\n"+
		"            <dia:point val=\"42.5,32.2118\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"color\">\n"+
		"            <dia:color val=\"#000000\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"alignment\">\n"+
		"            <dia:enum val=\"1\"/>\n"+
		"          </dia:attribute>\n"+
		"        </dia:composite>\n"+
		"      </dia:attribute>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Flowchart - Box\" version=\"0\" id=\"O52\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"41,34\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"40.95,33.95;44.05,35.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_corner\">\n"+
		"        <dia:point val=\"41,34\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_width\">\n"+
		"        <dia:real val=\"3\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_height\">\n"+
		"        <dia:real val=\"1.9000000000000001\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"show_background\">\n"+
		"        <dia:boolean val=\"true\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"padding\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"text\">\n"+
		"        <dia:composite type=\"text\">\n"+
		"          <dia:attribute name=\"string\">\n"+
		"            <dia:string>#Pit 3#</dia:string>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"font\">\n"+
		"            <dia:font family=\"sans\" style=\"0\" name=\"Helvetica\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"height\">\n"+
		"            <dia:real val=\"0.80000000000000004\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"pos\">\n"+
		"            <dia:point val=\"42.5,35.19\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"color\">\n"+
		"            <dia:color val=\"#000000\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"alignment\">\n"+
		"            <dia:enum val=\"1\"/>\n"+
		"          </dia:attribute>\n"+
		"        </dia:composite>\n"+
		"      </dia:attribute>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Flowchart - Box\" version=\"0\" id=\"O53\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"41,37\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"40.95,36.95;44.05,38.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_corner\">\n"+
		"        <dia:point val=\"41,37\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_width\">\n"+
		"        <dia:real val=\"3\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_height\">\n"+
		"        <dia:real val=\"1.9000000000000001\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"show_background\">\n"+
		"        <dia:boolean val=\"true\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"padding\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"text\">\n"+
		"        <dia:composite type=\"text\">\n"+
		"          <dia:attribute name=\"string\">\n"+
		"            <dia:string>#Pit 2#</dia:string>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"font\">\n"+
		"            <dia:font family=\"sans\" style=\"0\" name=\"Helvetica\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"height\">\n"+
		"            <dia:real val=\"0.80000000000000004\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"pos\">\n"+
		"            <dia:point val=\"42.5,38.19\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"color\">\n"+
		"            <dia:color val=\"#000000\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"alignment\">\n"+
		"            <dia:enum val=\"1\"/>\n"+
		"          </dia:attribute>\n"+
		"        </dia:composite>\n"+
		"      </dia:attribute>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Flowchart - Box\" version=\"0\" id=\"O54\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"41,40\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"40.95,39.95;44.05,41.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_corner\">\n"+
		"        <dia:point val=\"41,40\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_width\">\n"+
		"        <dia:real val=\"3\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_height\">\n"+
		"        <dia:real val=\"1.9000000000000004\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"show_background\">\n"+
		"        <dia:boolean val=\"true\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"padding\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"text\">\n"+
		"        <dia:composite type=\"text\">\n"+
		"          <dia:attribute name=\"string\">\n"+
		"            <dia:string>#Pit 1#</dia:string>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"font\">\n"+
		"            <dia:font family=\"sans\" style=\"0\" name=\"Helvetica\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"height\">\n"+
		"            <dia:real val=\"0.80000000000000004\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"pos\">\n"+
		"            <dia:point val=\"42.5,41.19\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"color\">\n"+
		"            <dia:color val=\"#000000\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"alignment\">\n"+
		"            <dia:enum val=\"1\"/>\n"+
		"          </dia:attribute>\n"+
		"        </dia:composite>\n"+
		"      </dia:attribute>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Text\" version=\"1\" id=\"O55\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"37.5,29.5665\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"37.5,28.9265;38.675,29.699\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"text\">\n"+
		"        <dia:composite type=\"text\">\n"+
		"          <dia:attribute name=\"string\">\n"+
		"            <dia:string>#HAS#</dia:string>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"font\">\n"+
		"            <dia:font family=\"sans\" style=\"0\" name=\"Helvetica\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"height\">\n"+
		"            <dia:real val=\"0.80000000000000004\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"pos\">\n"+
		"            <dia:point val=\"37.5,29.5665\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"color\">\n"+
		"            <dia:color val=\"#000000\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"alignment\">\n"+
		"            <dia:enum val=\"0\"/>\n"+
		"          </dia:attribute>\n"+
		"        </dia:composite>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"valign\">\n"+
		"        <dia:enum val=\"3\"/>\n"+
		"      </dia:attribute>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - ZigZagLine\" version=\"1\" id=\"O56\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"37.1675,30\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"37.1175,22.6191;41.1118,30.05\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"orth_points\">\n"+
		"        <dia:point val=\"37.1675,30\"/>\n"+
		"        <dia:point val=\"39.0837,30\"/>\n"+
		"        <dia:point val=\"39.0837,22.95\"/>\n"+
		"        <dia:point val=\"41,22.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"orth_orient\">\n"+
		"        <dia:enum val=\"0\"/>\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"        <dia:enum val=\"0\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"autorouting\">\n"+
		"        <dia:boolean val=\"true\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow\">\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_length\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_width\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:connections>\n"+
		"        <dia:connection handle=\"0\" to=\"O47\" connection=\"8\"/>\n"+
		"        <dia:connection handle=\"1\" to=\"O48\" connection=\"7\"/>\n"+
		"      </dia:connections>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - ZigZagLine\" version=\"1\" id=\"O57\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"37.1675,30\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"37.1175,25.6191;41.1118,30.05\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"orth_points\">\n"+
		"        <dia:point val=\"37.1675,30\"/>\n"+
		"        <dia:point val=\"39.0837,30\"/>\n"+
		"        <dia:point val=\"39.0837,25.95\"/>\n"+
		"        <dia:point val=\"41,25.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"orth_orient\">\n"+
		"        <dia:enum val=\"0\"/>\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"        <dia:enum val=\"0\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"autorouting\">\n"+
		"        <dia:boolean val=\"true\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow\">\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_length\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_width\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:connections>\n"+
		"        <dia:connection handle=\"0\" to=\"O47\" connection=\"8\"/>\n"+
		"        <dia:connection handle=\"1\" to=\"O49\" connection=\"7\"/>\n"+
		"      </dia:connections>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - ZigZagLine\" version=\"1\" id=\"O58\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"37.1675,30\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"37.1175,28.6191;41.1118,30.05\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"orth_points\">\n"+
		"        <dia:point val=\"37.1675,30\"/>\n"+
		"        <dia:point val=\"39.0837,30\"/>\n"+
		"        <dia:point val=\"39.0837,28.95\"/>\n"+
		"        <dia:point val=\"41,28.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"orth_orient\">\n"+
		"        <dia:enum val=\"0\"/>\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"        <dia:enum val=\"0\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"autorouting\">\n"+
		"        <dia:boolean val=\"true\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow\">\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_length\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_width\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:connections>\n"+
		"        <dia:connection handle=\"0\" to=\"O47\" connection=\"8\"/>\n"+
		"        <dia:connection handle=\"1\" to=\"O50\" connection=\"7\"/>\n"+
		"      </dia:connections>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - ZigZagLine\" version=\"1\" id=\"O59\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"37.1675,30\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"37.1175,29.95;41.1118,32.3027\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"orth_points\">\n"+
		"        <dia:point val=\"37.1675,30\"/>\n"+
		"        <dia:point val=\"39.0837,30\"/>\n"+
		"        <dia:point val=\"39.0837,31.9718\"/>\n"+
		"        <dia:point val=\"41,31.9718\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"orth_orient\">\n"+
		"        <dia:enum val=\"0\"/>\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"        <dia:enum val=\"0\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"autorouting\">\n"+
		"        <dia:boolean val=\"true\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow\">\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_length\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_width\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:connections>\n"+
		"        <dia:connection handle=\"0\" to=\"O47\" connection=\"8\"/>\n"+
		"        <dia:connection handle=\"1\" to=\"O51\" connection=\"7\"/>\n"+
		"      </dia:connections>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - ZigZagLine\" version=\"1\" id=\"O60\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"37.1675,30\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"37.1175,29.95;41.1118,35.2809\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"orth_points\">\n"+
		"        <dia:point val=\"37.1675,30\"/>\n"+
		"        <dia:point val=\"39.0837,30\"/>\n"+
		"        <dia:point val=\"39.0837,34.95\"/>\n"+
		"        <dia:point val=\"41,34.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"orth_orient\">\n"+
		"        <dia:enum val=\"0\"/>\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"        <dia:enum val=\"0\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"autorouting\">\n"+
		"        <dia:boolean val=\"true\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow\">\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_length\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_width\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:connections>\n"+
		"        <dia:connection handle=\"0\" to=\"O47\" connection=\"8\"/>\n"+
		"        <dia:connection handle=\"1\" to=\"O52\" connection=\"7\"/>\n"+
		"      </dia:connections>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - ZigZagLine\" version=\"1\" id=\"O61\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"37.1675,30\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"37.1175,29.95;41.1118,38.2809\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"orth_points\">\n"+
		"        <dia:point val=\"37.1675,30\"/>\n"+
		"        <dia:point val=\"39.0837,30\"/>\n"+
		"        <dia:point val=\"39.0837,37.95\"/>\n"+
		"        <dia:point val=\"41,37.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"orth_orient\">\n"+
		"        <dia:enum val=\"0\"/>\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"        <dia:enum val=\"0\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"autorouting\">\n"+
		"        <dia:boolean val=\"true\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow\">\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_length\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_width\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:connections>\n"+
		"        <dia:connection handle=\"0\" to=\"O47\" connection=\"8\"/>\n"+
		"        <dia:connection handle=\"1\" to=\"O53\" connection=\"7\"/>\n"+
		"      </dia:connections>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - ZigZagLine\" version=\"1\" id=\"O62\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"37.1675,30\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"37.1175,29.95;41.1118,41.2809\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"orth_points\">\n"+
		"        <dia:point val=\"37.1675,30\"/>\n"+
		"        <dia:point val=\"39.0837,30\"/>\n"+
		"        <dia:point val=\"39.0837,40.95\"/>\n"+
		"        <dia:point val=\"41,40.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"orth_orient\">\n"+
		"        <dia:enum val=\"0\"/>\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"        <dia:enum val=\"0\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"autorouting\">\n"+
		"        <dia:boolean val=\"true\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow\">\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_length\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_width\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:connections>\n"+
		"        <dia:connection handle=\"0\" to=\"O47\" connection=\"8\"/>\n"+
		"        <dia:connection handle=\"1\" to=\"O54\" connection=\"7\"/>\n"+
		"      </dia:connections>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Text\" version=\"1\" id=\"O63\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"-2.50026,33.1033\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"-2.50026,32.4633;-2.50026,33.2358\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"text\">\n"+
		"        <dia:composite type=\"text\">\n"+
		"          <dia:attribute name=\"string\">\n"+
		"            <dia:string>##</dia:string>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"font\">\n"+
		"            <dia:font family=\"sans\" style=\"0\" name=\"Helvetica\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"height\">\n"+
		"            <dia:real val=\"0.80000000000000004\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"pos\">\n"+
		"            <dia:point val=\"-2.50026,33.1033\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"color\">\n"+
		"            <dia:color val=\"#000000\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"alignment\">\n"+
		"            <dia:enum val=\"0\"/>\n"+
		"          </dia:attribute>\n"+
		"        </dia:composite>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"valign\">\n"+
		"        <dia:enum val=\"3\"/>\n"+
		"      </dia:attribute>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Text\" version=\"1\" id=\"O64\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"49.6247,32.4033\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"49.6247,31.7633;49.6247,32.5358\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"text\">\n"+
		"        <dia:composite type=\"text\">\n"+
		"          <dia:attribute name=\"string\">\n"+
		"            <dia:string>##</dia:string>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"font\">\n"+
		"            <dia:font family=\"sans\" style=\"0\" name=\"Helvetica\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"height\">\n"+
		"            <dia:real val=\"0.80000000000000004\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"pos\">\n"+
		"            <dia:point val=\"49.6247,32.4033\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"color\">\n"+
		"            <dia:color val=\"#000000\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"alignment\">\n"+
		"            <dia:enum val=\"0\"/>\n"+
		"          </dia:attribute>\n"+
		"        </dia:composite>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"valign\">\n"+
		"        <dia:enum val=\"3\"/>\n"+
		"      </dia:attribute>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Text\" version=\"1\" id=\"O65\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"47,25.475\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"47,24.835;47,25.6075\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"text\">\n"+
		"        <dia:composite type=\"text\">\n"+
		"          <dia:attribute name=\"string\">\n"+
		"            <dia:string>##</dia:string>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"font\">\n"+
		"            <dia:font family=\"sans\" style=\"0\" name=\"Helvetica\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"height\">\n"+
		"            <dia:real val=\"0.80000000000000004\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"pos\">\n"+
		"            <dia:point val=\"47,25.475\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"color\">\n"+
		"            <dia:color val=\"#000000\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"alignment\">\n"+
		"            <dia:enum val=\"0\"/>\n"+
		"          </dia:attribute>\n"+
		"        </dia:composite>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"valign\">\n"+
		"        <dia:enum val=\"3\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:connections>\n"+
		"        <dia:connection handle=\"0\" to=\"O68\" connection=\"5\"/>\n"+
		"      </dia:connections>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Text\" version=\"1\" id=\"O66\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"51,22.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"51,22.31;51,23.0825\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"text\">\n"+
		"        <dia:composite type=\"text\">\n"+
		"          <dia:attribute name=\"string\">\n"+
		"            <dia:string>##</dia:string>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"font\">\n"+
		"            <dia:font family=\"sans\" style=\"0\" name=\"Helvetica\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"height\">\n"+
		"            <dia:real val=\"0.80000000000000004\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"pos\">\n"+
		"            <dia:point val=\"51,22.95\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"color\">\n"+
		"            <dia:color val=\"#000000\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"alignment\">\n"+
		"            <dia:enum val=\"0\"/>\n"+
		"          </dia:attribute>\n"+
		"        </dia:composite>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"valign\">\n"+
		"        <dia:enum val=\"3\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:connections>\n"+
		"        <dia:connection handle=\"0\" to=\"O67\" connection=\"8\"/>\n"+
		"      </dia:connections>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Flowchart - Box\" version=\"0\" id=\"O67\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"47,22\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"46.95,21.95;51.05,23.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_corner\">\n"+
		"        <dia:point val=\"47,22\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_width\">\n"+
		"        <dia:real val=\"4\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_height\">\n"+
		"        <dia:real val=\"1.9000000000000001\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"show_background\">\n"+
		"        <dia:boolean val=\"true\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"padding\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"text\">\n"+
		"        <dia:composite type=\"text\">\n"+
		"          <dia:attribute name=\"string\">\n"+
		"            <dia:string>#$SN_2_S#</dia:string>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"font\">\n"+
		"            <dia:font family=\"sans\" style=\"0\" name=\"Helvetica\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"height\">\n"+
		"            <dia:real val=\"0.80000000000000004\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"pos\">\n"+
		"            <dia:point val=\"49,23.19\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"color\">\n"+
		"            <dia:color val=\"#000000\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"alignment\">\n"+
		"            <dia:enum val=\"1\"/>\n"+
		"          </dia:attribute>\n"+
		"        </dia:composite>\n"+
		"      </dia:attribute>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Flowchart - Box\" version=\"0\" id=\"O68\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"47,25\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"46.95,24.95;51.05,26.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_corner\">\n"+
		"        <dia:point val=\"47,25\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_width\">\n"+
		"        <dia:real val=\"4\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_height\">\n"+
		"        <dia:real val=\"1.9000000000000001\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"show_background\">\n"+
		"        <dia:boolean val=\"true\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"padding\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"text\">\n"+
		"        <dia:composite type=\"text\">\n"+
		"          <dia:attribute name=\"string\">\n"+
		"            <dia:string>#$SN_2_6#</dia:string>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"font\">\n"+
		"            <dia:font family=\"sans\" style=\"0\" name=\"Helvetica\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"height\">\n"+
		"            <dia:real val=\"0.80000000000000004\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"pos\">\n"+
		"            <dia:point val=\"49,26.19\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"color\">\n"+
		"            <dia:color val=\"#000000\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"alignment\">\n"+
		"            <dia:enum val=\"1\"/>\n"+
		"          </dia:attribute>\n"+
		"        </dia:composite>\n"+
		"      </dia:attribute>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Flowchart - Box\" version=\"0\" id=\"O69\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"47,28\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"46.95,27.95;51.05,29.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_corner\">\n"+
		"        <dia:point val=\"47,28\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_width\">\n"+
		"        <dia:real val=\"4\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_height\">\n"+
		"        <dia:real val=\"1.9000000000000001\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"show_background\">\n"+
		"        <dia:boolean val=\"true\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"padding\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"text\">\n"+
		"        <dia:composite type=\"text\">\n"+
		"          <dia:attribute name=\"string\">\n"+
		"            <dia:string>#$SN_2_5#</dia:string>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"font\">\n"+
		"            <dia:font family=\"sans\" style=\"0\" name=\"Helvetica\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"height\">\n"+
		"            <dia:real val=\"0.80000000000000004\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"pos\">\n"+
		"            <dia:point val=\"49,29.19\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"color\">\n"+
		"            <dia:color val=\"#000000\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"alignment\">\n"+
		"            <dia:enum val=\"1\"/>\n"+
		"          </dia:attribute>\n"+
		"        </dia:composite>\n"+
		"      </dia:attribute>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Flowchart - Box\" version=\"0\" id=\"O70\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"47,31\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"46.95,30.95;51.05,32.9936\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_corner\">\n"+
		"        <dia:point val=\"47,31\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_width\">\n"+
		"        <dia:real val=\"4\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_height\">\n"+
		"        <dia:real val=\"1.9435674545454518\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"show_background\">\n"+
		"        <dia:boolean val=\"true\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"padding\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"text\">\n"+
		"        <dia:composite type=\"text\">\n"+
		"          <dia:attribute name=\"string\">\n"+
		"            <dia:string>#$SN_2_4#</dia:string>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"font\">\n"+
		"            <dia:font family=\"sans\" style=\"0\" name=\"Helvetica\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"height\">\n"+
		"            <dia:real val=\"0.80000000000000004\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"pos\">\n"+
		"            <dia:point val=\"49,32.2118\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"color\">\n"+
		"            <dia:color val=\"#000000\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"alignment\">\n"+
		"            <dia:enum val=\"1\"/>\n"+
		"          </dia:attribute>\n"+
		"        </dia:composite>\n"+
		"      </dia:attribute>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Flowchart - Box\" version=\"0\" id=\"O71\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"47,34\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"46.95,33.95;51.05,35.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_corner\">\n"+
		"        <dia:point val=\"47,34\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_width\">\n"+
		"        <dia:real val=\"4\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_height\">\n"+
		"        <dia:real val=\"1.9000000000000001\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"show_background\">\n"+
		"        <dia:boolean val=\"true\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"padding\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"text\">\n"+
		"        <dia:composite type=\"text\">\n"+
		"          <dia:attribute name=\"string\">\n"+
		"            <dia:string>#$SN_2_3#</dia:string>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"font\">\n"+
		"            <dia:font family=\"sans\" style=\"0\" name=\"Helvetica\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"height\">\n"+
		"            <dia:real val=\"0.80000000000000004\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"pos\">\n"+
		"            <dia:point val=\"49,35.19\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"color\">\n"+
		"            <dia:color val=\"#000000\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"alignment\">\n"+
		"            <dia:enum val=\"1\"/>\n"+
		"          </dia:attribute>\n"+
		"        </dia:composite>\n"+
		"      </dia:attribute>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Flowchart - Box\" version=\"0\" id=\"O72\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"47,37\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"46.95,36.95;51.05,38.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_corner\">\n"+
		"        <dia:point val=\"47,37\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_width\">\n"+
		"        <dia:real val=\"4\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_height\">\n"+
		"        <dia:real val=\"1.9000000000000001\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"show_background\">\n"+
		"        <dia:boolean val=\"true\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"padding\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"text\">\n"+
		"        <dia:composite type=\"text\">\n"+
		"          <dia:attribute name=\"string\">\n"+
		"            <dia:string>#$SN_2_2#</dia:string>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"font\">\n"+
		"            <dia:font family=\"sans\" style=\"0\" name=\"Helvetica\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"height\">\n"+
		"            <dia:real val=\"0.80000000000000004\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"pos\">\n"+
		"            <dia:point val=\"49,38.19\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"color\">\n"+
		"            <dia:color val=\"#000000\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"alignment\">\n"+
		"            <dia:enum val=\"1\"/>\n"+
		"          </dia:attribute>\n"+
		"        </dia:composite>\n"+
		"      </dia:attribute>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Flowchart - Box\" version=\"0\" id=\"O73\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"47,40\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"46.95,39.95;51.05,41.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_corner\">\n"+
		"        <dia:point val=\"47,40\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_width\">\n"+
		"        <dia:real val=\"4\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_height\">\n"+
		"        <dia:real val=\"1.9000000000000004\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"show_background\">\n"+
		"        <dia:boolean val=\"true\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"padding\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"text\">\n"+
		"        <dia:composite type=\"text\">\n"+
		"          <dia:attribute name=\"string\">\n"+
		"            <dia:string>#$SN_2_1#</dia:string>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"font\">\n"+
		"            <dia:font family=\"sans\" style=\"0\" name=\"Helvetica\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"height\">\n"+
		"            <dia:real val=\"0.80000000000000004\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"pos\">\n"+
		"            <dia:point val=\"49,41.19\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"color\">\n"+
		"            <dia:color val=\"#000000\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"alignment\">\n"+
		"            <dia:enum val=\"1\"/>\n"+
		"          </dia:attribute>\n"+
		"        </dia:composite>\n"+
		"      </dia:attribute>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Line\" version=\"0\" id=\"O74\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"44,22.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"43.95,22.6191;47.1118,23.2809\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"conn_endpoints\">\n"+
		"        <dia:point val=\"44,22.95\"/>\n"+
		"        <dia:point val=\"47,22.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"numcp\">\n"+
		"        <dia:int val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow\">\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_length\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_width\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:connections>\n"+
		"        <dia:connection handle=\"0\" to=\"O48\" connection=\"8\"/>\n"+
		"        <dia:connection handle=\"1\" to=\"O67\" connection=\"7\"/>\n"+
		"      </dia:connections>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Line\" version=\"0\" id=\"O75\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"44,25.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"43.95,25.6191;47.1118,26.2809\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"conn_endpoints\">\n"+
		"        <dia:point val=\"44,25.95\"/>\n"+
		"        <dia:point val=\"47,25.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"numcp\">\n"+
		"        <dia:int val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow\">\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_length\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_width\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:connections>\n"+
		"        <dia:connection handle=\"0\" to=\"O49\" connection=\"8\"/>\n"+
		"        <dia:connection handle=\"1\" to=\"O68\" connection=\"7\"/>\n"+
		"      </dia:connections>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Line\" version=\"0\" id=\"O76\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"44,28.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"43.95,28.6191;47.1118,29.2809\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"conn_endpoints\">\n"+
		"        <dia:point val=\"44,28.95\"/>\n"+
		"        <dia:point val=\"47,28.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"numcp\">\n"+
		"        <dia:int val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow\">\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_length\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_width\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:connections>\n"+
		"        <dia:connection handle=\"0\" to=\"O50\" connection=\"8\"/>\n"+
		"        <dia:connection handle=\"1\" to=\"O69\" connection=\"7\"/>\n"+
		"      </dia:connections>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Line\" version=\"0\" id=\"O77\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"44,31.9718\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"43.95,31.6409;47.1118,32.3027\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"conn_endpoints\">\n"+
		"        <dia:point val=\"44,31.9718\"/>\n"+
		"        <dia:point val=\"47,31.9718\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"numcp\">\n"+
		"        <dia:int val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow\">\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_length\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_width\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:connections>\n"+
		"        <dia:connection handle=\"0\" to=\"O51\" connection=\"8\"/>\n"+
		"        <dia:connection handle=\"1\" to=\"O70\" connection=\"7\"/>\n"+
		"      </dia:connections>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Line\" version=\"0\" id=\"O78\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"44,34.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"43.95,34.6191;47.1118,35.2809\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"conn_endpoints\">\n"+
		"        <dia:point val=\"44,34.95\"/>\n"+
		"        <dia:point val=\"47,34.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"numcp\">\n"+
		"        <dia:int val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow\">\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_length\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_width\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:connections>\n"+
		"        <dia:connection handle=\"0\" to=\"O52\" connection=\"8\"/>\n"+
		"        <dia:connection handle=\"1\" to=\"O71\" connection=\"7\"/>\n"+
		"      </dia:connections>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Line\" version=\"0\" id=\"O79\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"44,37.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"43.95,37.6191;47.1118,38.2809\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"conn_endpoints\">\n"+
		"        <dia:point val=\"44,37.95\"/>\n"+
		"        <dia:point val=\"47,37.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"numcp\">\n"+
		"        <dia:int val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow\">\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_length\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_width\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:connections>\n"+
		"        <dia:connection handle=\"0\" to=\"O53\" connection=\"8\"/>\n"+
		"        <dia:connection handle=\"1\" to=\"O72\" connection=\"7\"/>\n"+
		"      </dia:connections>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Line\" version=\"0\" id=\"O80\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"44,40.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"43.95,40.6191;47.1118,41.2809\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"conn_endpoints\">\n"+
		"        <dia:point val=\"44,40.95\"/>\n"+
		"        <dia:point val=\"47,40.95\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"numcp\">\n"+
		"        <dia:int val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow\">\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_length\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_width\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:connections>\n"+
		"        <dia:connection handle=\"0\" to=\"O54\" connection=\"8\"/>\n"+
		"        <dia:connection handle=\"1\" to=\"O73\" connection=\"7\"/>\n"+
		"      </dia:connections>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Text\" version=\"1\" id=\"O81\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"45,22\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"45,21.36;45.9775,22.1325\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"text\">\n"+
		"        <dia:composite type=\"text\">\n"+
		"          <dia:attribute name=\"string\">\n"+
		"            <dia:string>#has#</dia:string>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"font\">\n"+
		"            <dia:font family=\"sans\" style=\"0\" name=\"Helvetica\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"height\">\n"+
		"            <dia:real val=\"0.80000000000000004\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"pos\">\n"+
		"            <dia:point val=\"45,22\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"color\">\n"+
		"            <dia:color val=\"#000000\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"alignment\">\n"+
		"            <dia:enum val=\"0\"/>\n"+
		"          </dia:attribute>\n"+
		"        </dia:composite>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"valign\">\n"+
		"        <dia:enum val=\"3\"/>\n"+
		"      </dia:attribute>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Text\" version=\"1\" id=\"O82\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"45,25\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"45,24.36;45.9775,25.1325\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"text\">\n"+
		"        <dia:composite type=\"text\">\n"+
		"          <dia:attribute name=\"string\">\n"+
		"            <dia:string>#has#</dia:string>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"font\">\n"+
		"            <dia:font family=\"sans\" style=\"0\" name=\"Helvetica\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"height\">\n"+
		"            <dia:real val=\"0.80000000000000004\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"pos\">\n"+
		"            <dia:point val=\"45,25\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"color\">\n"+
		"            <dia:color val=\"#000000\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"alignment\">\n"+
		"            <dia:enum val=\"0\"/>\n"+
		"          </dia:attribute>\n"+
		"        </dia:composite>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"valign\">\n"+
		"        <dia:enum val=\"3\"/>\n"+
		"      </dia:attribute>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Text\" version=\"1\" id=\"O83\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"45,28\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"45,27.36;45.9775,28.1325\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"text\">\n"+
		"        <dia:composite type=\"text\">\n"+
		"          <dia:attribute name=\"string\">\n"+
		"            <dia:string>#has#</dia:string>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"font\">\n"+
		"            <dia:font family=\"sans\" style=\"0\" name=\"Helvetica\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"height\">\n"+
		"            <dia:real val=\"0.80000000000000004\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"pos\">\n"+
		"            <dia:point val=\"45,28\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"color\">\n"+
		"            <dia:color val=\"#000000\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"alignment\">\n"+
		"            <dia:enum val=\"0\"/>\n"+
		"          </dia:attribute>\n"+
		"        </dia:composite>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"valign\">\n"+
		"        <dia:enum val=\"3\"/>\n"+
		"      </dia:attribute>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Text\" version=\"1\" id=\"O84\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"45,31\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"45,30.36;45.9775,31.1325\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"text\">\n"+
		"        <dia:composite type=\"text\">\n"+
		"          <dia:attribute name=\"string\">\n"+
		"            <dia:string>#has#</dia:string>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"font\">\n"+
		"            <dia:font family=\"sans\" style=\"0\" name=\"Helvetica\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"height\">\n"+
		"            <dia:real val=\"0.80000000000000004\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"pos\">\n"+
		"            <dia:point val=\"45,31\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"color\">\n"+
		"            <dia:color val=\"#000000\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"alignment\">\n"+
		"            <dia:enum val=\"0\"/>\n"+
		"          </dia:attribute>\n"+
		"        </dia:composite>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"valign\">\n"+
		"        <dia:enum val=\"3\"/>\n"+
		"      </dia:attribute>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Text\" version=\"1\" id=\"O85\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"45,34\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"45,33.36;45.9775,34.1325\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"text\">\n"+
		"        <dia:composite type=\"text\">\n"+
		"          <dia:attribute name=\"string\">\n"+
		"            <dia:string>#has#</dia:string>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"font\">\n"+
		"            <dia:font family=\"sans\" style=\"0\" name=\"Helvetica\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"height\">\n"+
		"            <dia:real val=\"0.80000000000000004\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"pos\">\n"+
		"            <dia:point val=\"45,34\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"color\">\n"+
		"            <dia:color val=\"#000000\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"alignment\">\n"+
		"            <dia:enum val=\"0\"/>\n"+
		"          </dia:attribute>\n"+
		"        </dia:composite>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"valign\">\n"+
		"        <dia:enum val=\"3\"/>\n"+
		"      </dia:attribute>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Text\" version=\"1\" id=\"O86\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"45,37\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"45,36.36;45.9775,37.1325\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"text\">\n"+
		"        <dia:composite type=\"text\">\n"+
		"          <dia:attribute name=\"string\">\n"+
		"            <dia:string>#has#</dia:string>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"font\">\n"+
		"            <dia:font family=\"sans\" style=\"0\" name=\"Helvetica\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"height\">\n"+
		"            <dia:real val=\"0.80000000000000004\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"pos\">\n"+
		"            <dia:point val=\"45,37\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"color\">\n"+
		"            <dia:color val=\"#000000\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"alignment\">\n"+
		"            <dia:enum val=\"0\"/>\n"+
		"          </dia:attribute>\n"+
		"        </dia:composite>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"valign\">\n"+
		"        <dia:enum val=\"3\"/>\n"+
		"      </dia:attribute>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Text\" version=\"1\" id=\"O87\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"45,40\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"45,39.36;45.9775,40.1325\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"text\">\n"+
		"        <dia:composite type=\"text\">\n"+
		"          <dia:attribute name=\"string\">\n"+
		"            <dia:string>#has#</dia:string>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"font\">\n"+
		"            <dia:font family=\"sans\" style=\"0\" name=\"Helvetica\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"height\">\n"+
		"            <dia:real val=\"0.80000000000000004\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"pos\">\n"+
		"            <dia:point val=\"45,40\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"color\">\n"+
		"            <dia:color val=\"#000000\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"alignment\">\n"+
		"            <dia:enum val=\"0\"/>\n"+
		"          </dia:attribute>\n"+
		"        </dia:composite>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"valign\">\n"+
		"        <dia:enum val=\"3\"/>\n"+
		"      </dia:attribute>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Arc\" version=\"0\" id=\"O88\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"34.5838,28\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"24.95,26.95;34.6338,28.0503\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"conn_endpoints\">\n"+
		"        <dia:point val=\"34.5838,28\"/>\n"+
		"        <dia:point val=\"25,28\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"curve_distance\">\n"+
		"        <dia:real val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow\">\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_length\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_width\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:connections>\n"+
		"        <dia:connection handle=\"0\" to=\"O47\" connection=\"2\"/>\n"+
		"      </dia:connections>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Arc\" version=\"0\" id=\"O89\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"24.5837,32.017\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"24.5336,31.9304;35.0501,33.0585\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"conn_endpoints\">\n"+
		"        <dia:point val=\"24.5837,32.017\"/>\n"+
		"        <dia:point val=\"35,32\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"curve_distance\">\n"+
		"        <dia:real val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow\">\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_length\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_width\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:connections>\n"+
		"        <dia:connection handle=\"0\" to=\"O0\" connection=\"13\"/>\n"+
		"      </dia:connections>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Text\" version=\"1\" id=\"O90\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"29,26\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"29,25.36;30.99,26.1325\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"text\">\n"+
		"        <dia:composite type=\"text\">\n"+
		"          <dia:attribute name=\"string\">\n"+
		"            <dia:string>#next to#</dia:string>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"font\">\n"+
		"            <dia:font family=\"sans\" style=\"0\" name=\"Helvetica\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"height\">\n"+
		"            <dia:real val=\"0.80000000000000004\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"pos\">\n"+
		"            <dia:point val=\"29,26\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"color\">\n"+
		"            <dia:color val=\"#000000\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"alignment\">\n"+
		"            <dia:enum val=\"0\"/>\n"+
		"          </dia:attribute>\n"+
		"        </dia:composite>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"valign\">\n"+
		"        <dia:enum val=\"3\"/>\n"+
		"      </dia:attribute>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Text\" version=\"1\" id=\"O91\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"29,34.2\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"29,33.56;30.99,34.3325\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"text\">\n"+
		"        <dia:composite type=\"text\">\n"+
		"          <dia:attribute name=\"string\">\n"+
		"            <dia:string>#next to#</dia:string>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"font\">\n"+
		"            <dia:font family=\"sans\" style=\"0\" name=\"Helvetica\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"height\">\n"+
		"            <dia:real val=\"0.80000000000000004\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"pos\">\n"+
		"            <dia:point val=\"29,34.2\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"color\">\n"+
		"            <dia:color val=\"#000000\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"alignment\">\n"+
		"            <dia:enum val=\"0\"/>\n"+
		"          </dia:attribute>\n"+
		"        </dia:composite>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"valign\">\n"+
		"        <dia:enum val=\"3\"/>\n"+
		"      </dia:attribute>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Line\" version=\"0\" id=\"O92\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"42.5,40\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"42.1691,38.7882;42.8309,40.05\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"conn_endpoints\">\n"+
		"        <dia:point val=\"42.5,40\"/>\n"+
		"        <dia:point val=\"42.5,38.9\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"numcp\">\n"+
		"        <dia:int val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow\">\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_length\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_width\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:connections>\n"+
		"        <dia:connection handle=\"0\" to=\"O54\" connection=\"2\"/>\n"+
		"        <dia:connection handle=\"1\" to=\"O53\" connection=\"13\"/>\n"+
		"      </dia:connections>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Line\" version=\"0\" id=\"O93\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"42.5,37\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"42.1691,35.7882;42.8309,37.05\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"conn_endpoints\">\n"+
		"        <dia:point val=\"42.5,37\"/>\n"+
		"        <dia:point val=\"42.5,35.9\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"numcp\">\n"+
		"        <dia:int val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow\">\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_length\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_width\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:connections>\n"+
		"        <dia:connection handle=\"0\" to=\"O53\" connection=\"2\"/>\n"+
		"        <dia:connection handle=\"1\" to=\"O52\" connection=\"13\"/>\n"+
		"      </dia:connections>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Line\" version=\"0\" id=\"O94\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"42.5,34\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"42.1691,32.8318;42.8309,34.05\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"conn_endpoints\">\n"+
		"        <dia:point val=\"42.5,34\"/>\n"+
		"        <dia:point val=\"42.5,32.9436\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"numcp\">\n"+
		"        <dia:int val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow\">\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_length\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_width\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:connections>\n"+
		"        <dia:connection handle=\"0\" to=\"O52\" connection=\"2\"/>\n"+
		"        <dia:connection handle=\"1\" to=\"O51\" connection=\"13\"/>\n"+
		"      </dia:connections>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Line\" version=\"0\" id=\"O95\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"42.5,31\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"42.1691,29.7882;42.8309,31.05\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"conn_endpoints\">\n"+
		"        <dia:point val=\"42.5,31\"/>\n"+
		"        <dia:point val=\"42.5,29.9\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"numcp\">\n"+
		"        <dia:int val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow\">\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_length\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_width\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:connections>\n"+
		"        <dia:connection handle=\"0\" to=\"O51\" connection=\"2\"/>\n"+
		"        <dia:connection handle=\"1\" to=\"O50\" connection=\"13\"/>\n"+
		"      </dia:connections>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Line\" version=\"0\" id=\"O96\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"42.5,28\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"42.1691,26.7882;42.8309,28.05\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"conn_endpoints\">\n"+
		"        <dia:point val=\"42.5,28\"/>\n"+
		"        <dia:point val=\"42.5,26.9\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"numcp\">\n"+
		"        <dia:int val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow\">\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_length\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_width\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:connections>\n"+
		"        <dia:connection handle=\"0\" to=\"O50\" connection=\"2\"/>\n"+
		"        <dia:connection handle=\"1\" to=\"O49\" connection=\"13\"/>\n"+
		"      </dia:connections>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Line\" version=\"0\" id=\"O97\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"42.5,25\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"42.1691,23.7882;42.8309,25.05\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"conn_endpoints\">\n"+
		"        <dia:point val=\"42.5,25\"/>\n"+
		"        <dia:point val=\"42.5,23.9\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"numcp\">\n"+
		"        <dia:int val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow\">\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_length\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_width\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:connections>\n"+
		"        <dia:connection handle=\"0\" to=\"O49\" connection=\"2\"/>\n"+
		"        <dia:connection handle=\"1\" to=\"O48\" connection=\"13\"/>\n"+
		"      </dia:connections>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Arc\" version=\"0\" id=\"O98\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"15.5,41.9\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"15.4498,41.7658;43.0502,43.0006\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"conn_endpoints\">\n"+
		"        <dia:point val=\"15.5,41.9\"/>\n"+
		"        <dia:point val=\"43,42\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"curve_distance\">\n"+
		"        <dia:real val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow\">\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_length\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_width\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:connections>\n"+
		"        <dia:connection handle=\"0\" to=\"O11\" connection=\"13\"/>\n"+
		"      </dia:connections>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Arc\" version=\"0\" id=\"O99\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"42.5,22\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"14.95,20.95;42.55,22.2317\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"conn_endpoints\">\n"+
		"        <dia:point val=\"42.5,22\"/>\n"+
		"        <dia:point val=\"15,22\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"curve_distance\">\n"+
		"        <dia:real val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow\">\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_length\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_width\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:connections>\n"+
		"        <dia:connection handle=\"0\" to=\"O48\" connection=\"2\"/>\n"+
		"      </dia:connections>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Text\" version=\"1\" id=\"O100\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"28,42\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"28,41.36;29.99,42.1325\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"text\">\n"+
		"        <dia:composite type=\"text\">\n"+
		"          <dia:attribute name=\"string\">\n"+
		"            <dia:string>#next to#</dia:string>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"font\">\n"+
		"            <dia:font family=\"sans\" style=\"0\" name=\"Helvetica\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"height\">\n"+
		"            <dia:real val=\"0.80000000000000004\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"pos\">\n"+
		"            <dia:point val=\"28,42\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"color\">\n"+
		"            <dia:color val=\"#000000\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"alignment\">\n"+
		"            <dia:enum val=\"0\"/>\n"+
		"          </dia:attribute>\n"+
		"        </dia:composite>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"valign\">\n"+
		"        <dia:enum val=\"3\"/>\n"+
		"      </dia:attribute>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Text\" version=\"1\" id=\"O101\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"27,22\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"27,21.36;28.99,22.1325\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"text\">\n"+
		"        <dia:composite type=\"text\">\n"+
		"          <dia:attribute name=\"string\">\n"+
		"            <dia:string>#next to#</dia:string>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"font\">\n"+
		"            <dia:font family=\"sans\" style=\"0\" name=\"Helvetica\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"height\">\n"+
		"            <dia:real val=\"0.80000000000000004\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"pos\">\n"+
		"            <dia:point val=\"27,22\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"color\">\n"+
		"            <dia:color val=\"#000000\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"alignment\">\n"+
		"            <dia:enum val=\"0\"/>\n"+
		"          </dia:attribute>\n"+
		"        </dia:composite>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"valign\">\n"+
		"        <dia:enum val=\"3\"/>\n"+
		"      </dia:attribute>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Box\" version=\"0\" id=\"O102\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"27,36\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"26.95,35.95;32.05,39.1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_corner\">\n"+
		"        <dia:point val=\"27,36\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_width\">\n"+
		"        <dia:real val=\"5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"elem_height\">\n"+
		"        <dia:real val=\"3.0499999999999972\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"show_background\">\n"+
		"        <dia:boolean val=\"true\"/>\n"+
		"      </dia:attribute>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - Text\" version=\"1\" id=\"O103\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"28.65,37.35\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"28.65,36.71;30.27,37.4825\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"text\">\n"+
		"        <dia:composite type=\"text\">\n"+
		"          <dia:attribute name=\"string\">\n"+
		"            <dia:string>#TURN#</dia:string>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"font\">\n"+
		"            <dia:font family=\"sans\" style=\"0\" name=\"Helvetica\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"height\">\n"+
		"            <dia:real val=\"0.80000000000000004\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"pos\">\n"+
		"            <dia:point val=\"28.65,37.35\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"color\">\n"+
		"            <dia:color val=\"#000000\"/>\n"+
		"          </dia:attribute>\n"+
		"          <dia:attribute name=\"alignment\">\n"+
		"            <dia:enum val=\"0\"/>\n"+
		"          </dia:attribute>\n"+
		"        </dia:composite>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"valign\">\n"+
		"        <dia:enum val=\"3\"/>\n"+
		"      </dia:attribute>\n"+
		"    </dia:object>\n"+
		"    <dia:object type=\"Standard - ZigZagLine\" version=\"1\" id=\"O104\">\n"+
		"      <dia:attribute name=\"obj_pos\">\n"+
		"        <dia:point val=\"24.5837,32.017\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"obj_bb\">\n"+
		"        <dia:rectangle val=\"24.5337,31.967;27.1118,37.8559\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"orth_points\">\n"+
		"        <dia:point val=\"24.5837,32.017\"/>\n"+
		"        <dia:point val=\"24.5837,37.525\"/>\n"+
		"        <dia:point val=\"27,37.525\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"orth_orient\">\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"        <dia:enum val=\"0\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"autorouting\">\n"+
		"        <dia:boolean val=\"true\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow\">\n"+
		"        <dia:enum val=\"1\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_length\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:attribute name=\"end_arrow_width\">\n"+
		"        <dia:real val=\"0.5\"/>\n"+
		"      </dia:attribute>\n"+
		"      <dia:connections>\n"+
		"        <dia:connection handle=\"0\" to=\"O0\" connection=\"13\"/>\n"+
		"        <dia:connection handle=\"1\" to=\"O102\" connection=\"3\"/>\n"+
		"      </dia:connections>\n"+
		"    </dia:object>\n"+
		"  </dia:layer>\n"+
		"</dia:diagram>\n";
	
}
