package com.iz2use.labels.electricalboard.model

import io.circe._

sealed abstract class Icon(val label: String, val svg: String = "")
object Icon {

  case object heater extends Icon(
    "convecteur",
    """<rect
       style="opacity:1;fill:none;fill-opacity:1;fill-rule:evenodd;stroke:#000000;stroke-width:1;stroke-linejoin:round;stroke-miterlimit:4;stroke-dasharray:none;stroke-opacity:1;paint-order:normal"
       id="rect1779"
       width="21"
       height="13"
       x="1.5"
       y="9.4999533"
       rx="1.9090909" />
    <path
       style="fill:none;fill-rule:evenodd;stroke:#000000;stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1"
       d="M 2,11.5 H 22"
       id="path1781"
       inkscape:connector-curvature="0" />
    <path
       style="fill:none;fill-rule:evenodd;stroke:#000000;stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1"
       d="M 2,13.5 H 22"
       id="path1783"
       inkscape:connector-curvature="0" />
    <path
       style="fill:none;fill-rule:evenodd;stroke:#000000;stroke-width:1;stroke-linecap:butt;stroke-linejoin:miter;stroke-miterlimit:4;stroke-dasharray:none;stroke-opacity:1"
       d="m 12,1 c 0.549238,1 0.549238,2 0,3.5 C 11.450762,6 11.450762,7 12,8"
       id="path1787"
       inkscape:connector-curvature="0"
       sodipodi:nodetypes="czc" />
    <path
       style="display:inline;fill:none;fill-rule:evenodd;stroke:#000000;stroke-width:1;stroke-linecap:butt;stroke-linejoin:miter;stroke-miterlimit:4;stroke-dasharray:none;stroke-opacity:1"
       d="M 9,1 C 9.549238,2 9.549238,3 9,4.5 8.450762,6 8.450762,7 9,8"
       id="path1787-6"
       inkscape:connector-curvature="0"
       sodipodi:nodetypes="czc" />
    <path
       style="display:inline;fill:none;fill-rule:evenodd;stroke:#000000;stroke-width:1;stroke-linecap:butt;stroke-linejoin:miter;stroke-miterlimit:4;stroke-dasharray:none;stroke-opacity:1"
       d="m 15,1 c 0.549238,1 0.549238,2 0,3.5 C 14.450762,6 14.450762,7 15,8"
       id="path1787-1"
       inkscape:connector-curvature="0"
       sodipodi:nodetypes="czc" />"""
  )
  case object boiler extends Icon(
    "CE",
    """<path
       style="opacity:1;fill:none;fill-opacity:1;fill-rule:evenodd;stroke:#000000;stroke-width:1;stroke-miterlimit:4;stroke-dasharray:none;stroke-opacity:1;paint-order:normal"
       d="M 8.5,2.5 C 11,2 13,2 15.5,2.5 c 0.543242,0.1086483 1,0.446 1,1 v 13 c 0,0.554 -0.456758,0.891352 -1,1 -2.5,0.5 -4.5,0.5 -7,0 -0.5432417,-0.108648 -1,-0.446 -1,-1 v -13 c 0,-0.554 0.4567583,-0.8913517 1,-1 z"
       id="rect1764"
       inkscape:connector-curvature="0"
       sodipodi:nodetypes="sssssssss" />
    <path
       style="fill:none;fill-rule:evenodd;stroke:#000000;stroke-width:1;stroke-linecap:butt;stroke-linejoin:round;stroke-miterlimit:4;stroke-dasharray:none;stroke-opacity:1"
       d="M 23,22.5 H 11.5 c -0.5,0 -1,-0.5 -1,-1 V 18"
       id="path1771"
       inkscape:connector-curvature="0"
       sodipodi:nodetypes="cccc" />
    <path
       style="fill:none;fill-rule:evenodd;stroke:#000000;stroke-width:1;stroke-linecap:butt;stroke-linejoin:miter;stroke-miterlimit:4;stroke-dasharray:none;stroke-opacity:1"
       d="m 23,20.5 h -8.5 c -0.5,0 -1,-0.5 -1,-1 V 18"
       id="path1773"
       inkscape:connector-curvature="0"
       sodipodi:nodetypes="cccc" />"""
  )
  case object light extends Icon(
    "Lumière",
    """<path
       style="fill:#000000;fill-opacity:1;fill-rule:evenodd;stroke:none;stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1"
       d="M 8.8671875,15.841797 C 8.9473954,16.37057 9,16.918873 9,17.5 c 0,2.209139 1.265948,5 3,5 1.734052,0 3,-2.790861 3,-5 0,-0.581127 0.0526,-1.12943 0.132812,-1.658203 z"
       id="path1909"
       inkscape:connector-curvature="0" />
    <path
       style="display:inline;opacity:1;fill:none;fill-opacity:1;fill-rule:evenodd;stroke:#040000;stroke-width:1;stroke-linejoin:round;stroke-miterlimit:4;stroke-dasharray:none;stroke-opacity:1;paint-order:normal"
       d="m 12,22.5 c 0,0 -3,0 -3,-4.384615 C 9,13.96056 6.5,11.257136 6.5,8.8589743 6.5,5.8992945 8.9624339,3.5 12,3.5 c 3.037566,0 5.5,2.3992945 5.5,5.3589743 C 17.5,11.257136 15,13.96056 15,18.115385 15,22.5 12,22.5 12,22.5 Z"
       id="path1850-0-5"
       inkscape:connector-curvature="0"
       sodipodi:nodetypes="cccsccc" />
    <path
       style="display:inline;opacity:1;fill:none;fill-rule:evenodd;stroke:#000000;stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1"
       d="M 4.368272,1.5753788 6.4895924,3.6966991"
       id="path2134-5-4"
       inkscape:connector-curvature="0" />
    <path
       style="display:inline;opacity:1;fill:none;fill-rule:evenodd;stroke:#000000;stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1"
       d="m 19.631728,1.5753788 -2.12132,2.1213203"
       id="path2134-5-0"
       inkscape:connector-curvature="0" />
    <path
       style="display:inline;opacity:1;fill:none;fill-rule:evenodd;stroke:#000000;stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1"
       d="m 1.5,9.5 h 3"
       id="path2134-5-5"
       inkscape:connector-curvature="0" />
    <path
       style="display:inline;opacity:1;fill:none;fill-rule:evenodd;stroke:#000000;stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1"
       d="m 22.5,9.5 h -3"
       id="path2134-5-3"
       inkscape:connector-curvature="0" />"""
  )
  case object hotplate extends Icon(
    "Cuisson",
    """<rect
       style="opacity:1;fill:none;fill-opacity:1;fill-rule:evenodd;stroke:#000000;stroke-width:1;stroke-linejoin:miter;stroke-miterlimit:4;stroke-dasharray:none;stroke-opacity:1;paint-order:normal"
       id="rect1813"
       width="21"
       height="21"
       x="1.5"
       y="1.5" />
    <circle
       style="opacity:1;fill:none;fill-opacity:1;fill-rule:evenodd;stroke:#000000;stroke-width:1;stroke-linejoin:miter;stroke-miterlimit:4;stroke-dasharray:none;stroke-opacity:1;paint-order:normal"
       id="path1815"
       cx="6"
       cy="6"
       r="2.5" />
    <circle
       style="opacity:1;fill:none;fill-opacity:1;fill-rule:evenodd;stroke:#000000;stroke-width:0.99999988;stroke-linejoin:miter;stroke-miterlimit:4;stroke-dasharray:none;stroke-opacity:1;paint-order:normal"
       id="path1815-1"
       cx="7"
       cy="17"
       r="3.5" />
    <circle
       style="opacity:1;fill:none;fill-opacity:1;fill-rule:evenodd;stroke:#000000;stroke-width:0.99999988;stroke-linejoin:miter;stroke-miterlimit:4;stroke-dasharray:none;stroke-opacity:1;paint-order:normal"
       id="path1815-1-4"
       cx="15.5"
       cy="9.5"
       r="5" />"""
  )
  case object power extends Icon(
    "PC",
    """<circle
       r="10.5"
       style="opacity:1;fill:none;fill-opacity:1;fill-rule:evenodd;stroke:#000000;stroke-width:1;stroke-miterlimit:4;stroke-dasharray:none;stroke-opacity:1;paint-order:normal"
       id="path1249"
       cx="12"
       cy="11.999953" />
    <path
       inkscape:connector-curvature="0"
       id="path1759"
       d="M 13.5,7 A 1.5,1.5 0 0 1 12,8.5 1.5,1.5 0 0 1 10.5,7 1.5,1.5 0 0 1 12,5.5 1.5,1.5 0 0 1 13.5,7 Z"
       style="opacity:1;fill:none;fill-opacity:1;fill-rule:evenodd;stroke:#000000;stroke-width:1;stroke-miterlimit:4;stroke-dasharray:none;stroke-opacity:1;paint-order:normal" />
    <path
       inkscape:connector-curvature="0"
       id="path1757"
       d="M 18.5,12 A 1.5,1.5 0 0 1 17,13.5 1.5,1.5 0 0 1 15.5,12 1.5,1.5 0 0 1 17,10.5 1.5,1.5 0 0 1 18.5,12 Z"
       style="opacity:1;fill:#000000;fill-opacity:1;fill-rule:evenodd;stroke:#000000;stroke-width:1;stroke-miterlimit:4;stroke-dasharray:none;stroke-opacity:1;paint-order:normal" />
    <path
       inkscape:connector-curvature="0"
       id="path1228-5-3"
       d="M 8.5,12 A 1.5,1.5 0 0 1 7,13.5 1.5,1.5 0 0 1 5.5,12 1.5,1.5 0 0 1 7,10.5 1.5,1.5 0 0 1 8.5,12 Z"
       style="opacity:1;fill:#000000;fill-opacity:1;fill-rule:evenodd;stroke:#000000;stroke-width:1;stroke-miterlimit:4;stroke-dasharray:none;stroke-opacity:1;paint-order:normal" />"""
  )
  case object rollerBlind extends Icon(
    "VR",
    """<path
       style="fill:none;fill-rule:evenodd;stroke:#000000;stroke-width:2;stroke-linecap:butt;stroke-linejoin:miter;stroke-miterlimit:4;stroke-dasharray:none;stroke-opacity:1"
       d="M 12,22 V 2"
       id="path2391"
       inkscape:connector-curvature="0" />
    <rect
       style="opacity:1;fill:none;fill-opacity:1;fill-rule:evenodd;stroke:#000000;stroke-width:1;stroke-linejoin:miter;stroke-miterlimit:4;stroke-dasharray:none;stroke-opacity:1;paint-order:normal"
       id="rect2342"
       width="21"
       height="21"
       x="1.5"
       y="1.5" />
    <rect
       style="opacity:1;fill:#ffffff;fill-opacity:1;fill-rule:evenodd;stroke:#000000;stroke-width:1;stroke-linejoin:miter;stroke-miterlimit:4;stroke-dasharray:none;stroke-opacity:1;paint-order:normal"
       id="rect2342-3-6"
       width="21"
       height="15"
       x="1.5"
       y="1.5" />
    <g
       id="g4072"
       transform="translate(0,1.5795)">
      <path
         sodipodi:nodetypes="cc"
         inkscape:connector-curvature="0"
         id="path2393"
         d="M 8,3 V 9"
         style="fill:none;fill-rule:evenodd;stroke:#000000;stroke-width:2;stroke-linecap:butt;stroke-linejoin:miter;stroke-miterlimit:4;stroke-dasharray:none;stroke-opacity:1;marker-end:url(#marker3956)" />
      <path
         sodipodi:nodetypes="cc"
         inkscape:connector-curvature="0"
         id="path2393-1"
         d="M 16,11.841 V 5.8409999"
         style="fill:none;fill-rule:evenodd;stroke:#000000;stroke-width:2;stroke-linecap:butt;stroke-linejoin:miter;stroke-miterlimit:4;stroke-dasharray:none;stroke-opacity:1;marker-end:url(#marker3862)" />
    </g>"""
  )
  case object washer extends Icon(
    "LL",
    """<path
       style="opacity:1;fill:#000000;fill-opacity:1;fill-rule:evenodd;stroke:none;stroke-width:0.99999988;stroke-linejoin:miter;stroke-miterlimit:4;stroke-dasharray:none;stroke-opacity:1;paint-order:normal"
       d="m 7.5097656,13.816406 c -0.0025,0.04034 -0.00445,0.08071 -0.00586,0.121094 l 0.011719,0.40625 C 7.6952142,16.687876 9.649005,18.498706 12,18.5 c 2.485281,0 4.5,-2.014719 4.5,-4.5 -7.3e-4,-0.06058 -0.0027,-0.12114 -0.0059,-0.181641 C 15,12 14,16 12,13.822266 10,11.644532 9,12 7.5097656,13.816406 Z"
       id="path4111-8"
       inkscape:connector-curvature="0"
       sodipodi:nodetypes="cccccczc" />
    <rect
       style="opacity:1;fill:none;fill-opacity:1;fill-rule:evenodd;stroke:#000000;stroke-width:1;stroke-linejoin:miter;stroke-miterlimit:4;stroke-dasharray:none;stroke-opacity:1;paint-order:normal"
       id="rect4075"
       width="17"
       height="21"
       x="3.5"
       y="1.5" />
    <path
       style="fill:none;fill-rule:evenodd;stroke:#000000;stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1"
       d="M 3,5.5 H 21"
       id="path4077"
       inkscape:connector-curvature="0" />
    <circle
       style="opacity:1;fill:none;fill-opacity:1;fill-rule:evenodd;stroke:#000000;stroke-width:0.99999988;stroke-linejoin:miter;stroke-miterlimit:4;stroke-dasharray:none;stroke-opacity:1;paint-order:normal"
       id="path4111"
       cx="12"
       cy="14"
       r="4.5" />
    <rect
       style="opacity:1;fill:#000000;fill-opacity:1;fill-rule:evenodd;stroke:none;stroke-width:1;stroke-linejoin:miter;stroke-miterlimit:4;stroke-dasharray:none;stroke-opacity:1;paint-order:normal"
       id="rect4132"
       width="2"
       height="1"
       x="17"
       y="3" />
    <rect
       style="opacity:1;fill:#000000;fill-opacity:1;fill-rule:evenodd;stroke:none;stroke-width:1;stroke-linejoin:miter;stroke-miterlimit:4;stroke-dasharray:none;stroke-opacity:1;paint-order:normal"
       id="rect4134"
       width="1"
       height="1"
       x="14"
       y="3" />"""
  )
  case object dryer extends Icon(
    "SL",
    """<rect
       style="opacity:1;fill:none;fill-opacity:1;fill-rule:evenodd;stroke:#000000;stroke-width:1;stroke-linejoin:miter;stroke-miterlimit:4;stroke-dasharray:none;stroke-opacity:1;paint-order:normal"
       id="rect4075-5"
       width="17"
       height="21"
       x="3.5"
       y="1.5" />
    <path
       style="fill:none;fill-rule:evenodd;stroke:#000000;stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1"
       d="M 3,5.5 H 21"
       id="path4077-3"
       inkscape:connector-curvature="0" />
    <circle
       style="opacity:1;fill:none;fill-opacity:1;fill-rule:evenodd;stroke:#000000;stroke-width:0.99999988;stroke-linejoin:miter;stroke-miterlimit:4;stroke-dasharray:none;stroke-opacity:1;paint-order:normal"
       id="path4111-6"
       cx="12"
       cy="14"
       r="4.5" />
    <rect
       style="opacity:1;fill:#000000;fill-opacity:1;fill-rule:evenodd;stroke:none;stroke-width:1;stroke-linejoin:miter;stroke-miterlimit:4;stroke-dasharray:none;stroke-opacity:1;paint-order:normal"
       id="rect4132-2"
       width="2"
       height="1"
       x="17"
       y="3" />
    <rect
       style="opacity:1;fill:#000000;fill-opacity:1;fill-rule:evenodd;stroke:none;stroke-width:1;stroke-linejoin:miter;stroke-miterlimit:4;stroke-dasharray:none;stroke-opacity:1;paint-order:normal"
       id="rect4134-0"
       width="1"
       height="1"
       x="14"
       y="3" />
    <g
       id="g4190"
       transform="translate(-0.5,0.5)">
      <path
         sodipodi:nodetypes="czc"
         inkscape:connector-curvature="0"
         id="path1787-9"
         d="m 11,11 c 0.549238,0.714286 0.549238,1.428571 0,2.5 -0.549238,1.071429 -0.549238,1.785714 0,2.5"
         style="display:inline;fill:none;fill-rule:evenodd;stroke:#000000;stroke-width:1;stroke-linecap:butt;stroke-linejoin:miter;stroke-miterlimit:4;stroke-dasharray:none;stroke-opacity:1" />
      <path
         sodipodi:nodetypes="czc"
         inkscape:connector-curvature="0"
         id="path1787-1-4"
         d="m 14,11 c 0.549238,0.714286 0.549238,1.428571 0,2.5 -0.549238,1.071429 -0.549238,1.785714 0,2.5"
         style="display:inline;fill:none;fill-rule:evenodd;stroke:#000000;stroke-width:1;stroke-linecap:butt;stroke-linejoin:miter;stroke-miterlimit:4;stroke-dasharray:none;stroke-opacity:1" />
    </g>"""
  )
  case object heatPump extends Icon("PAC", heater.svg)
  case object extractor extends Icon(
    "Hotte",
    """<path
       sodipodi:nodetypes="ccccc"
       inkscape:connector-curvature="0"
       id="path5434"
       d="M 1.5,8.5 V 12 h 21 V 8.5 Z"
       style="opacity:1;fill:none;fill-opacity:1;fill-rule:evenodd;stroke:#000000;stroke-width:1;stroke-linejoin:miter;stroke-miterlimit:4;stroke-dasharray:none;stroke-opacity:1;paint-order:normal" />
    <path
       sodipodi:nodetypes="ccccc"
       inkscape:connector-curvature="0"
       id="rect5426"
       d="M 20,8.5 16,1 H 8 L 4,8.5 Z"
       style="opacity:1;fill:none;fill-opacity:1;fill-rule:evenodd;stroke:#000000;stroke-width:1;stroke-linejoin:miter;stroke-miterlimit:4;stroke-dasharray:none;stroke-opacity:1;paint-order:normal" />
    <path
       style="display:inline;fill:none;fill-rule:evenodd;stroke:#000000;stroke-width:1;stroke-linecap:butt;stroke-linejoin:miter;stroke-miterlimit:4;stroke-dasharray:none;stroke-opacity:1;marker-end:url(#marker7503)"
       d="m 12.295097,21.510075 c 0.455681,-0.82966 0.455681,-1.65932 0,-2.90381 -0.455681,-1.244491 -0.455681,-2.074151 0,-2.903811"
       id="path1787-8"
       inkscape:connector-curvature="0"
       sodipodi:nodetypes="czc" />
    <path
       style="display:inline;fill:none;fill-rule:evenodd;stroke:#000000;stroke-width:1;stroke-linecap:butt;stroke-linejoin:miter;stroke-miterlimit:4;stroke-dasharray:none;stroke-opacity:1;marker-end:url(#marker7299)"
       d="m 6.806117,21.510075 c 0.455681,-0.82966 0.455681,-1.65932 0,-2.90381 -0.455681,-1.244491 -0.455681,-2.074151 0,-2.903811"
       id="path1787-6-7"
       inkscape:connector-curvature="0"
       sodipodi:nodetypes="czc" />
    <path
       style="display:inline;fill:none;fill-rule:evenodd;stroke:#000000;stroke-width:1;stroke-linecap:butt;stroke-linejoin:miter;stroke-miterlimit:4;stroke-dasharray:none;stroke-opacity:1;marker-end:url(#marker7645)"
       d="m 17.784077,21.510075 c 0.455681,-0.82966 0.455681,-1.65932 0,-2.90381 -0.45568,-1.244491 -0.45568,-2.074151 0,-2.903811"
       id="path1787-1-47"
       inkscape:connector-curvature="0"
       sodipodi:nodetypes="czc" />"""
  )
  case object mechanicalVentilation extends Icon(
    "VMC",
    """<circle
       style="opacity:1;fill:none;fill-opacity:1;fill-rule:evenodd;stroke:#000000;stroke-width:0.99999988;stroke-linejoin:round;stroke-miterlimit:4;stroke-dasharray:none;stroke-opacity:1;paint-order:normal"
       id="path2262"
       cx="12"
       cy="12"
       r="10.5" />
    <path
       style="fill:#000000;fill-opacity:1;fill-rule:evenodd;stroke:none;stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1"
       d="m 12.717737,12.330517 c 0.531249,-0.578148 6.410033,-1.534042 7.814842,0.995558 1.40481,2.529601 -4.542346,7.276006 -5.957464,5.098258 -1.415118,-2.177748 -2.388627,-5.515668 -1.857378,-6.093816 z"
       id="path2264"
       inkscape:connector-curvature="0"
       sodipodi:nodetypes="zzzz" />
    <path
       style="fill:#000000;fill-opacity:1;fill-rule:evenodd;stroke:none;stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1"
       d="M 11.927368,11.213163 C 11.161052,11.042162 7.3938318,6.4289326 8.8821251,3.9475323 10.370419,1.4661307 17.454504,4.2433164 16.276078,6.5577185 15.097652,8.8721206 12.693683,11.384164 11.927368,11.213163 Z"
       id="path2264-7"
       inkscape:connector-curvature="0"
       sodipodi:nodetypes="zzzz" />
    <path
       style="fill:#000000;fill-opacity:1;fill-rule:evenodd;stroke:none;stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1"
       d="m 11.354895,12.45632 c 0.235067,0.749149 -1.8764968,6.318272 -4.7695991,6.270073 -2.8931038,-0.0482 -4.0300331,-7.57179 -1.436489,-7.708444 2.5935441,-0.136655 5.9710221,0.689222 6.2060881,1.438371 z"
       id="path2264-1"
       inkscape:connector-curvature="0"
       sodipodi:nodetypes="zzzz" />
    <circle
       style="opacity:1;fill:#000000;fill-opacity:1;fill-rule:evenodd;stroke:#ffffff;stroke-width:1;stroke-linejoin:round;stroke-miterlimit:4;stroke-dasharray:none;stroke-opacity:1;paint-order:normal"
       id="path2277"
       cx="12"
       cy="12"
       r="2.5" />"""
  )
  case object dishwasher extends Icon(
    "LV",
    """<rect
       style="display:inline;opacity:1;fill:none;fill-opacity:1;fill-rule:evenodd;stroke:#000000;stroke-width:1;stroke-linejoin:miter;stroke-miterlimit:4;stroke-dasharray:none;stroke-opacity:1;paint-order:normal"
       id="rect4075-5-0"
       width="17"
       height="21"
       x="3.5"
       y="1.5" />
    <path
       style="display:inline;fill:none;fill-rule:evenodd;stroke:#000000;stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1"
       d="M 3,5.5 H 21"
       id="path4077-3-5"
       inkscape:connector-curvature="0" />
    <rect
       style="display:inline;opacity:1;fill:#000000;fill-opacity:1;fill-rule:evenodd;stroke:none;stroke-width:1;stroke-linejoin:miter;stroke-miterlimit:4;stroke-dasharray:none;stroke-opacity:1;paint-order:normal"
       id="rect4132-2-3"
       width="2"
       height="1"
       x="17"
       y="3" />
    <rect
       style="display:inline;opacity:1;fill:#000000;fill-opacity:1;fill-rule:evenodd;stroke:none;stroke-width:1;stroke-linejoin:miter;stroke-miterlimit:4;stroke-dasharray:none;stroke-opacity:1;paint-order:normal"
       id="rect4134-0-2"
       width="1"
       height="1"
       x="14"
       y="3" />
    <path
       style="fill:none;fill-opacity:1;fill-rule:evenodd;stroke:#000000;stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1"
       d="m 5.5,20.5 c 1,0 2,-0.454545 2,-1.545454 v -3.181454 c -1,0 -2,-1.182183 -2,-2.273092 V 7.5000001 h 6 V 13.5 c 0,1.090909 -1,2.273092 -2,2.273092 v 3.181454 c 0,1.090909 1,1.545454 2,1.545454"
       id="path4249"
       inkscape:connector-curvature="0"
       sodipodi:nodetypes="cccccccccc" />
    <path
       style="fill:none;fill-rule:evenodd;stroke:#000000;stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1"
       d="m 18.5,7 v 5 c 0,3 -2,2 -2,3.028571 V 21"
       id="path4257"
       inkscape:connector-curvature="0"
       sodipodi:nodetypes="cssc" />
    <path
       style="fill:none;fill-rule:evenodd;stroke:#000000;stroke-width:0.99999994px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1"
       d="M 16.5,6.9999998 V 12"
       id="path4259"
       inkscape:connector-curvature="0"
       sodipodi:nodetypes="cc" />
    <path
       style="fill:none;fill-rule:evenodd;stroke:#000000;stroke-width:0.99999994px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1"
       d="M 14.5,6.9999998 V 12"
       id="path4259-0"
       inkscape:connector-curvature="0"
       sodipodi:nodetypes="cc" />"""
  )
  case object fridge extends Icon(
    "Frigo",
    """<rect
       style="opacity:1;fill:none;fill-opacity:1;fill-rule:evenodd;stroke:#000000;stroke-width:1;stroke-linejoin:miter;stroke-miterlimit:4;stroke-dasharray:none;stroke-opacity:1;paint-order:normal"
       id="rect8891"
       width="13"
       height="6"
       x="5.5"
       y="1.5" />
    <rect
       style="opacity:1;fill:none;fill-opacity:1;fill-rule:evenodd;stroke:#000000;stroke-width:0.99999994;stroke-linejoin:miter;stroke-miterlimit:4;stroke-dasharray:none;stroke-opacity:1;paint-order:normal"
       id="rect8891-9"
       width="13"
       height="15"
       x="5.5"
       y="7.5" />
    <rect
       style="opacity:1;fill:#000000;fill-opacity:1;fill-rule:evenodd;stroke:none;stroke-width:1;stroke-linejoin:miter;stroke-miterlimit:4;stroke-dasharray:none;stroke-opacity:1;paint-order:normal"
       id="rect8908"
       width="1"
       height="2"
       x="7"
       y="4" />
    <rect
       style="opacity:1;fill:#000000;fill-opacity:1;fill-rule:evenodd;stroke:none;stroke-width:1;stroke-linejoin:miter;stroke-miterlimit:4;stroke-dasharray:none;stroke-opacity:1;paint-order:normal"
       id="rect8910"
       width="1"
       height="3"
       x="7"
       y="10" />"""
  )
  case object oven extends Icon(
    "Four",
    """<rect
       style="opacity:1;fill:none;fill-opacity:1;fill-rule:evenodd;stroke:#000000;stroke-width:0.99999994;stroke-linejoin:miter;stroke-miterlimit:4;stroke-dasharray:none;stroke-opacity:1;paint-order:normal"
       id="rect8837"
       width="21"
       height="17"
       x="1.5"
       y="3.5" />
    <rect
       style="opacity:1;fill:none;fill-opacity:1;fill-rule:evenodd;stroke:#000000;stroke-width:1;stroke-linejoin:miter;stroke-miterlimit:4;stroke-dasharray:none;stroke-opacity:1;paint-order:normal"
       id="rect8837-8"
       width="17"
       height="11"
       x="3.5"
       y="7.5" />
    <rect
       style="opacity:1;fill:#000000;fill-opacity:1;fill-rule:evenodd;stroke:none;stroke-width:1;stroke-linejoin:miter;stroke-miterlimit:4;stroke-dasharray:none;stroke-opacity:1;paint-order:normal"
       id="rect8857"
       width="4"
       height="1"
       x="13"
       y="5" />
    <rect
       style="opacity:1;fill:#000000;fill-opacity:1;fill-rule:evenodd;stroke:none;stroke-width:1;stroke-linejoin:miter;stroke-miterlimit:4;stroke-dasharray:none;stroke-opacity:1;paint-order:normal"
       id="rect8857-1"
       width="4"
       height="1"
       x="7"
       y="5" />
    <rect
       style="opacity:1;fill:#000000;fill-opacity:1;fill-rule:evenodd;stroke:none;stroke-width:1;stroke-linejoin:miter;stroke-miterlimit:4;stroke-dasharray:none;stroke-opacity:1;paint-order:normal"
       id="rect8857-5"
       width="16"
       height="1"
       x="4"
       y="9" />
    <path
       style="fill:none;fill-rule:evenodd;stroke:#000000;stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1"
       d="M 5,16.5 H 19.000001"
       id="path8889"
       inkscape:connector-curvature="0" />"""
  )
  case object selectivePowerCut extends Icon("Délesteur")
  case object remoteSwitch extends Icon("Télérupteur", light.svg)

  val list = Seq(heater, boiler, light, hotplate, power, rollerBlind, washer, dryer, heatPump, extractor, mechanicalVentilation, dishwasher, fridge, oven, selectivePowerCut, remoteSwitch)
  val map = list.map(v => v.toString() -> v).toMap

  implicit val encoder = Encoder.encodeString.contramap[Option[Icon]] {
    case None    => ""
    case Some(v) => v.toString()
  }
  implicit val decoder = Decoder.decodeString.map[Option[Icon]] { v => map.get(v) }
}