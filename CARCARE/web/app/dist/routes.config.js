"use strict";
const router_1 = require('@angular/router');
const aboutus_component_1 = require("./aboutus.component");
const contactus_component_1 = require("./contactus.component");
const customer_component_1 = require("./customer.component");
const home_component_1 = require("./home.component");
const bookappointmentInfo_component_1 = require("./bookappointmentInfo.component");
let routes = [
    { path: 'home', component: home_component_1.HomeComponent },
    { path: 'customer', component: customer_component_1.CustomerComponent },
    { path: 'aboutus', component: aboutus_component_1.AboutUsComponent },
    { path: 'contactus', component: contactus_component_1.ContactUsComponent },
    { path: 'appointment', component: bookappointmentInfo_component_1.BookAppointmentInfoComponent },
    // {path:'cricket',component:CricketComponent},
    // {path:'movie/:mid',component:MovieComponent},
    { path: '', redirectTo: '/home', pathMatch: 'full' },
];
exports.configuredRoutes = router_1.RouterModule.forRoot(routes);
//# sourceMappingURL=routes.config.js.map