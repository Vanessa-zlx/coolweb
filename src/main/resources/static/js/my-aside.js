Vue.component('my-aside', {
    data: function () {
        return {
        }
    },
    methods: {
    },
    created: function () {
    },
    template: `
           <div id="menu">
                <div class="hamburger">
                    <div class="line"></div>
                    <div class="line"></div>
                    <div class="line"></div>
                </div>
                <div class="menu-inner">
                    <ul>
                        <li><p></p><svg t="1692534472790" class="icon" viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="2007" width="32" height="32"><path d="M97.792 513.536c0-228.864 185.344-414.208 414.208-414.208s414.208 185.344 414.208 414.208c-270.848 77.312-557.568 77.312-828.416 0z" fill="#FFFFFF" p-id="2008"></path><path d="M512 579.072c-140.288 0-280.064-19.456-416.256-58.368l-5.632-1.536v-5.632c0-232.96 189.44-421.888 421.888-421.888s421.888 189.44 421.888 421.888v5.632l-5.632 1.536c-136.192 38.912-275.968 58.368-416.256 58.368zM105.472 507.904c266.24 74.752 547.328 74.752 813.056 0-3.072-221.696-184.32-400.896-406.528-400.896s-403.456 179.2-406.528 400.896z" fill="#2E66FF" p-id="2009"></path><path d="M330.24 520.704m-90.112 0a90.112 90.112 0 1 0 180.224 0 90.112 90.112 0 1 0-180.224 0Z" fill="#FFF152" p-id="2010"></path><path d="M330.24 615.936c-52.736 0-95.232-43.008-95.232-95.232 0-52.736 43.008-95.232 95.232-95.232s95.232 43.008 95.232 95.232c0.512 52.224-42.496 95.232-95.232 95.232z m0-180.736c-47.104 0-84.992 38.4-84.992 84.992 0 47.104 38.4 84.992 84.992 84.992 47.104 0 84.992-38.4 84.992-84.992 0.512-46.592-37.888-84.992-84.992-84.992z" fill="#2E66FF" p-id="2011"></path><path d="M519.168 510.464m-90.112 0a90.112 90.112 0 1 0 180.224 0 90.112 90.112 0 1 0-180.224 0Z" fill="#FFF152" p-id="2012"></path><path d="M519.168 605.696c-52.736 0-95.232-43.008-95.232-95.232s43.008-95.232 95.232-95.232c52.736 0 95.232 43.008 95.232 95.232s-42.496 95.232-95.232 95.232z m0-180.224c-47.104 0-84.992 38.4-84.992 84.992s38.4 84.992 84.992 84.992c47.104 0 84.992-38.4 84.992-84.992s-37.888-84.992-84.992-84.992z" fill="#2E66FF" p-id="2013"></path><path d="M699.904 510.464m-90.112 0a90.112 90.112 0 1 0 180.224 0 90.112 90.112 0 1 0-180.224 0Z" fill="#FFB5EC" p-id="2014"></path><path d="M699.904 605.696c-52.736 0-95.232-43.008-95.232-95.232s43.008-95.232 95.232-95.232c52.736 0 95.232 43.008 95.232 95.232s-42.496 95.232-95.232 95.232z m0-180.224c-47.104 0-84.992 38.4-84.992 84.992s38.4 84.992 84.992 84.992c47.104 0 84.992-38.4 84.992-84.992s-37.888-84.992-84.992-84.992z" fill="#2E66FF" p-id="2015"></path><path d="M420.864 353.28m-90.112 0a90.112 90.112 0 1 0 180.224 0 90.112 90.112 0 1 0-180.224 0Z" fill="#C9E6FF" p-id="2016"></path><path d="M420.864 448.512c-27.136 0-54.272-11.264-72.704-33.792-16.384-19.456-24.576-44.032-22.016-69.632s13.824-48.64 33.28-65.024c39.936-33.792 100.352-29.184 134.144 11.264 33.792 39.936 29.184 100.352-11.264 134.144-17.92 15.872-39.936 23.04-61.44 23.04z m-0.512-180.224c-19.456 0-38.912 6.656-54.784 19.968-35.84 30.208-40.448 83.968-10.24 119.808s83.968 40.448 119.808 10.24 40.448-83.968 10.24-119.808c-16.384-19.968-40.448-30.208-65.024-30.208z" fill="#2E66FF" p-id="2017"></path><path d="M97.792 510.464c0 228.864 185.344 414.208 414.208 414.208s414.208-185.344 414.208-414.208C655.36 587.776 368.64 587.776 97.792 510.464z" fill="#FFB5EC" p-id="2018"></path><path d="M512 932.352c-232.96 0-421.888-189.44-421.888-421.888v-10.24l9.728 2.56c269.824 76.8 555.008 76.8 824.32 0l9.728-2.56v10.24c0 232.96-188.928 421.888-421.888 421.888z m-406.528-411.648c2.56 104.96 44.544 202.752 118.784 277.504 76.8 76.8 178.688 119.296 287.744 119.296 220.672 0 400.896-177.152 406.528-396.288-266.24 73.216-546.816 73.216-813.056-0.512z" fill="#2E66FF" p-id="2019"></path><path d="M339.456 822.272c-1.024 0-2.56-0.512-3.584-1.024-144.384-77.824-181.76-220.672-183.296-226.304-1.024-4.096 1.536-8.192 5.632-9.216 4.096-1.024 8.192 1.536 9.216 5.632 0.512 1.536 37.376 142.336 175.616 216.576 3.584 2.048 5.12 6.656 3.072 10.24-1.536 2.56-4.096 4.096-6.656 4.096z" fill="#FFF152" p-id="2020"></path><path d="M395.264 840.192m-13.312 0a13.312 13.312 0 1 0 26.624 0 13.312 13.312 0 1 0-26.624 0Z" fill="#FFF152" p-id="2021"></path><path d="M838.656 385.024c-3.072 0-6.144-2.048-7.168-4.608-0.512-1.536-55.808-136.192-202.24-191.488-4.096-1.536-6.144-6.144-4.608-9.728 1.536-4.096 6.144-6.144 9.728-4.608 153.6 57.856 208.896 194.56 211.456 200.704 1.536 4.096-0.512 8.192-4.096 9.728h-3.072z" fill="#C9E6FF" p-id="2022"></path><path d="M573.44 163.328m-13.312 0a13.312 13.312 0 1 0 26.624 0 13.312 13.312 0 1 0-26.624 0Z" fill="#C9E6FF" p-id="2023"></path></svg>
                            <a href="index.html">首页</a><p></p></li>
                        <li><svg t="1692534472790" class="icon" viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="2007" width="32" height="32"><path d="M97.792 513.536c0-228.864 185.344-414.208 414.208-414.208s414.208 185.344 414.208 414.208c-270.848 77.312-557.568 77.312-828.416 0z" fill="#FFFFFF" p-id="2008"></path><path d="M512 579.072c-140.288 0-280.064-19.456-416.256-58.368l-5.632-1.536v-5.632c0-232.96 189.44-421.888 421.888-421.888s421.888 189.44 421.888 421.888v5.632l-5.632 1.536c-136.192 38.912-275.968 58.368-416.256 58.368zM105.472 507.904c266.24 74.752 547.328 74.752 813.056 0-3.072-221.696-184.32-400.896-406.528-400.896s-403.456 179.2-406.528 400.896z" fill="#2E66FF" p-id="2009"></path><path d="M330.24 520.704m-90.112 0a90.112 90.112 0 1 0 180.224 0 90.112 90.112 0 1 0-180.224 0Z" fill="#FFF152" p-id="2010"></path><path d="M330.24 615.936c-52.736 0-95.232-43.008-95.232-95.232 0-52.736 43.008-95.232 95.232-95.232s95.232 43.008 95.232 95.232c0.512 52.224-42.496 95.232-95.232 95.232z m0-180.736c-47.104 0-84.992 38.4-84.992 84.992 0 47.104 38.4 84.992 84.992 84.992 47.104 0 84.992-38.4 84.992-84.992 0.512-46.592-37.888-84.992-84.992-84.992z" fill="#2E66FF" p-id="2011"></path><path d="M519.168 510.464m-90.112 0a90.112 90.112 0 1 0 180.224 0 90.112 90.112 0 1 0-180.224 0Z" fill="#FFF152" p-id="2012"></path><path d="M519.168 605.696c-52.736 0-95.232-43.008-95.232-95.232s43.008-95.232 95.232-95.232c52.736 0 95.232 43.008 95.232 95.232s-42.496 95.232-95.232 95.232z m0-180.224c-47.104 0-84.992 38.4-84.992 84.992s38.4 84.992 84.992 84.992c47.104 0 84.992-38.4 84.992-84.992s-37.888-84.992-84.992-84.992z" fill="#2E66FF" p-id="2013"></path><path d="M699.904 510.464m-90.112 0a90.112 90.112 0 1 0 180.224 0 90.112 90.112 0 1 0-180.224 0Z" fill="#FFB5EC" p-id="2014"></path><path d="M699.904 605.696c-52.736 0-95.232-43.008-95.232-95.232s43.008-95.232 95.232-95.232c52.736 0 95.232 43.008 95.232 95.232s-42.496 95.232-95.232 95.232z m0-180.224c-47.104 0-84.992 38.4-84.992 84.992s38.4 84.992 84.992 84.992c47.104 0 84.992-38.4 84.992-84.992s-37.888-84.992-84.992-84.992z" fill="#2E66FF" p-id="2015"></path><path d="M420.864 353.28m-90.112 0a90.112 90.112 0 1 0 180.224 0 90.112 90.112 0 1 0-180.224 0Z" fill="#C9E6FF" p-id="2016"></path><path d="M420.864 448.512c-27.136 0-54.272-11.264-72.704-33.792-16.384-19.456-24.576-44.032-22.016-69.632s13.824-48.64 33.28-65.024c39.936-33.792 100.352-29.184 134.144 11.264 33.792 39.936 29.184 100.352-11.264 134.144-17.92 15.872-39.936 23.04-61.44 23.04z m-0.512-180.224c-19.456 0-38.912 6.656-54.784 19.968-35.84 30.208-40.448 83.968-10.24 119.808s83.968 40.448 119.808 10.24 40.448-83.968 10.24-119.808c-16.384-19.968-40.448-30.208-65.024-30.208z" fill="#2E66FF" p-id="2017"></path><path d="M97.792 510.464c0 228.864 185.344 414.208 414.208 414.208s414.208-185.344 414.208-414.208C655.36 587.776 368.64 587.776 97.792 510.464z" fill="#FFB5EC" p-id="2018"></path><path d="M512 932.352c-232.96 0-421.888-189.44-421.888-421.888v-10.24l9.728 2.56c269.824 76.8 555.008 76.8 824.32 0l9.728-2.56v10.24c0 232.96-188.928 421.888-421.888 421.888z m-406.528-411.648c2.56 104.96 44.544 202.752 118.784 277.504 76.8 76.8 178.688 119.296 287.744 119.296 220.672 0 400.896-177.152 406.528-396.288-266.24 73.216-546.816 73.216-813.056-0.512z" fill="#2E66FF" p-id="2019"></path><path d="M339.456 822.272c-1.024 0-2.56-0.512-3.584-1.024-144.384-77.824-181.76-220.672-183.296-226.304-1.024-4.096 1.536-8.192 5.632-9.216 4.096-1.024 8.192 1.536 9.216 5.632 0.512 1.536 37.376 142.336 175.616 216.576 3.584 2.048 5.12 6.656 3.072 10.24-1.536 2.56-4.096 4.096-6.656 4.096z" fill="#FFF152" p-id="2020"></path><path d="M395.264 840.192m-13.312 0a13.312 13.312 0 1 0 26.624 0 13.312 13.312 0 1 0-26.624 0Z" fill="#FFF152" p-id="2021"></path><path d="M838.656 385.024c-3.072 0-6.144-2.048-7.168-4.608-0.512-1.536-55.808-136.192-202.24-191.488-4.096-1.536-6.144-6.144-4.608-9.728 1.536-4.096 6.144-6.144 9.728-4.608 153.6 57.856 208.896 194.56 211.456 200.704 1.536 4.096-0.512 8.192-4.096 9.728h-3.072z" fill="#C9E6FF" p-id="2022"></path><path d="M573.44 163.328m-13.312 0a13.312 13.312 0 1 0 26.624 0 13.312 13.312 0 1 0-26.624 0Z" fill="#C9E6FF" p-id="2023"></path></svg>
                            <a href="gkindex.html">手办</a><p></p></li>
                        <li><svg t="1692534472790" class="icon" viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="2007" width="32" height="32"><path d="M97.792 513.536c0-228.864 185.344-414.208 414.208-414.208s414.208 185.344 414.208 414.208c-270.848 77.312-557.568 77.312-828.416 0z" fill="#FFFFFF" p-id="2008"></path><path d="M512 579.072c-140.288 0-280.064-19.456-416.256-58.368l-5.632-1.536v-5.632c0-232.96 189.44-421.888 421.888-421.888s421.888 189.44 421.888 421.888v5.632l-5.632 1.536c-136.192 38.912-275.968 58.368-416.256 58.368zM105.472 507.904c266.24 74.752 547.328 74.752 813.056 0-3.072-221.696-184.32-400.896-406.528-400.896s-403.456 179.2-406.528 400.896z" fill="#2E66FF" p-id="2009"></path><path d="M330.24 520.704m-90.112 0a90.112 90.112 0 1 0 180.224 0 90.112 90.112 0 1 0-180.224 0Z" fill="#FFF152" p-id="2010"></path><path d="M330.24 615.936c-52.736 0-95.232-43.008-95.232-95.232 0-52.736 43.008-95.232 95.232-95.232s95.232 43.008 95.232 95.232c0.512 52.224-42.496 95.232-95.232 95.232z m0-180.736c-47.104 0-84.992 38.4-84.992 84.992 0 47.104 38.4 84.992 84.992 84.992 47.104 0 84.992-38.4 84.992-84.992 0.512-46.592-37.888-84.992-84.992-84.992z" fill="#2E66FF" p-id="2011"></path><path d="M519.168 510.464m-90.112 0a90.112 90.112 0 1 0 180.224 0 90.112 90.112 0 1 0-180.224 0Z" fill="#FFF152" p-id="2012"></path><path d="M519.168 605.696c-52.736 0-95.232-43.008-95.232-95.232s43.008-95.232 95.232-95.232c52.736 0 95.232 43.008 95.232 95.232s-42.496 95.232-95.232 95.232z m0-180.224c-47.104 0-84.992 38.4-84.992 84.992s38.4 84.992 84.992 84.992c47.104 0 84.992-38.4 84.992-84.992s-37.888-84.992-84.992-84.992z" fill="#2E66FF" p-id="2013"></path><path d="M699.904 510.464m-90.112 0a90.112 90.112 0 1 0 180.224 0 90.112 90.112 0 1 0-180.224 0Z" fill="#FFB5EC" p-id="2014"></path><path d="M699.904 605.696c-52.736 0-95.232-43.008-95.232-95.232s43.008-95.232 95.232-95.232c52.736 0 95.232 43.008 95.232 95.232s-42.496 95.232-95.232 95.232z m0-180.224c-47.104 0-84.992 38.4-84.992 84.992s38.4 84.992 84.992 84.992c47.104 0 84.992-38.4 84.992-84.992s-37.888-84.992-84.992-84.992z" fill="#2E66FF" p-id="2015"></path><path d="M420.864 353.28m-90.112 0a90.112 90.112 0 1 0 180.224 0 90.112 90.112 0 1 0-180.224 0Z" fill="#C9E6FF" p-id="2016"></path><path d="M420.864 448.512c-27.136 0-54.272-11.264-72.704-33.792-16.384-19.456-24.576-44.032-22.016-69.632s13.824-48.64 33.28-65.024c39.936-33.792 100.352-29.184 134.144 11.264 33.792 39.936 29.184 100.352-11.264 134.144-17.92 15.872-39.936 23.04-61.44 23.04z m-0.512-180.224c-19.456 0-38.912 6.656-54.784 19.968-35.84 30.208-40.448 83.968-10.24 119.808s83.968 40.448 119.808 10.24 40.448-83.968 10.24-119.808c-16.384-19.968-40.448-30.208-65.024-30.208z" fill="#2E66FF" p-id="2017"></path><path d="M97.792 510.464c0 228.864 185.344 414.208 414.208 414.208s414.208-185.344 414.208-414.208C655.36 587.776 368.64 587.776 97.792 510.464z" fill="#FFB5EC" p-id="2018"></path><path d="M512 932.352c-232.96 0-421.888-189.44-421.888-421.888v-10.24l9.728 2.56c269.824 76.8 555.008 76.8 824.32 0l9.728-2.56v10.24c0 232.96-188.928 421.888-421.888 421.888z m-406.528-411.648c2.56 104.96 44.544 202.752 118.784 277.504 76.8 76.8 178.688 119.296 287.744 119.296 220.672 0 400.896-177.152 406.528-396.288-266.24 73.216-546.816 73.216-813.056-0.512z" fill="#2E66FF" p-id="2019"></path><path d="M339.456 822.272c-1.024 0-2.56-0.512-3.584-1.024-144.384-77.824-181.76-220.672-183.296-226.304-1.024-4.096 1.536-8.192 5.632-9.216 4.096-1.024 8.192 1.536 9.216 5.632 0.512 1.536 37.376 142.336 175.616 216.576 3.584 2.048 5.12 6.656 3.072 10.24-1.536 2.56-4.096 4.096-6.656 4.096z" fill="#FFF152" p-id="2020"></path><path d="M395.264 840.192m-13.312 0a13.312 13.312 0 1 0 26.624 0 13.312 13.312 0 1 0-26.624 0Z" fill="#FFF152" p-id="2021"></path><path d="M838.656 385.024c-3.072 0-6.144-2.048-7.168-4.608-0.512-1.536-55.808-136.192-202.24-191.488-4.096-1.536-6.144-6.144-4.608-9.728 1.536-4.096 6.144-6.144 9.728-4.608 153.6 57.856 208.896 194.56 211.456 200.704 1.536 4.096-0.512 8.192-4.096 9.728h-3.072z" fill="#C9E6FF" p-id="2022"></path><path d="M573.44 163.328m-13.312 0a13.312 13.312 0 1 0 26.624 0 13.312 13.312 0 1 0-26.624 0Z" fill="#C9E6FF" p-id="2023"></path></svg>
                            <a href="game.html?id=1">ZELDA</a><p></p></li>
                        <li><svg t="1692534472790" class="icon" viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="2007" width="32" height="32"><path d="M97.792 513.536c0-228.864 185.344-414.208 414.208-414.208s414.208 185.344 414.208 414.208c-270.848 77.312-557.568 77.312-828.416 0z" fill="#FFFFFF" p-id="2008"></path><path d="M512 579.072c-140.288 0-280.064-19.456-416.256-58.368l-5.632-1.536v-5.632c0-232.96 189.44-421.888 421.888-421.888s421.888 189.44 421.888 421.888v5.632l-5.632 1.536c-136.192 38.912-275.968 58.368-416.256 58.368zM105.472 507.904c266.24 74.752 547.328 74.752 813.056 0-3.072-221.696-184.32-400.896-406.528-400.896s-403.456 179.2-406.528 400.896z" fill="#2E66FF" p-id="2009"></path><path d="M330.24 520.704m-90.112 0a90.112 90.112 0 1 0 180.224 0 90.112 90.112 0 1 0-180.224 0Z" fill="#FFF152" p-id="2010"></path><path d="M330.24 615.936c-52.736 0-95.232-43.008-95.232-95.232 0-52.736 43.008-95.232 95.232-95.232s95.232 43.008 95.232 95.232c0.512 52.224-42.496 95.232-95.232 95.232z m0-180.736c-47.104 0-84.992 38.4-84.992 84.992 0 47.104 38.4 84.992 84.992 84.992 47.104 0 84.992-38.4 84.992-84.992 0.512-46.592-37.888-84.992-84.992-84.992z" fill="#2E66FF" p-id="2011"></path><path d="M519.168 510.464m-90.112 0a90.112 90.112 0 1 0 180.224 0 90.112 90.112 0 1 0-180.224 0Z" fill="#FFF152" p-id="2012"></path><path d="M519.168 605.696c-52.736 0-95.232-43.008-95.232-95.232s43.008-95.232 95.232-95.232c52.736 0 95.232 43.008 95.232 95.232s-42.496 95.232-95.232 95.232z m0-180.224c-47.104 0-84.992 38.4-84.992 84.992s38.4 84.992 84.992 84.992c47.104 0 84.992-38.4 84.992-84.992s-37.888-84.992-84.992-84.992z" fill="#2E66FF" p-id="2013"></path><path d="M699.904 510.464m-90.112 0a90.112 90.112 0 1 0 180.224 0 90.112 90.112 0 1 0-180.224 0Z" fill="#FFB5EC" p-id="2014"></path><path d="M699.904 605.696c-52.736 0-95.232-43.008-95.232-95.232s43.008-95.232 95.232-95.232c52.736 0 95.232 43.008 95.232 95.232s-42.496 95.232-95.232 95.232z m0-180.224c-47.104 0-84.992 38.4-84.992 84.992s38.4 84.992 84.992 84.992c47.104 0 84.992-38.4 84.992-84.992s-37.888-84.992-84.992-84.992z" fill="#2E66FF" p-id="2015"></path><path d="M420.864 353.28m-90.112 0a90.112 90.112 0 1 0 180.224 0 90.112 90.112 0 1 0-180.224 0Z" fill="#C9E6FF" p-id="2016"></path><path d="M420.864 448.512c-27.136 0-54.272-11.264-72.704-33.792-16.384-19.456-24.576-44.032-22.016-69.632s13.824-48.64 33.28-65.024c39.936-33.792 100.352-29.184 134.144 11.264 33.792 39.936 29.184 100.352-11.264 134.144-17.92 15.872-39.936 23.04-61.44 23.04z m-0.512-180.224c-19.456 0-38.912 6.656-54.784 19.968-35.84 30.208-40.448 83.968-10.24 119.808s83.968 40.448 119.808 10.24 40.448-83.968 10.24-119.808c-16.384-19.968-40.448-30.208-65.024-30.208z" fill="#2E66FF" p-id="2017"></path><path d="M97.792 510.464c0 228.864 185.344 414.208 414.208 414.208s414.208-185.344 414.208-414.208C655.36 587.776 368.64 587.776 97.792 510.464z" fill="#FFB5EC" p-id="2018"></path><path d="M512 932.352c-232.96 0-421.888-189.44-421.888-421.888v-10.24l9.728 2.56c269.824 76.8 555.008 76.8 824.32 0l9.728-2.56v10.24c0 232.96-188.928 421.888-421.888 421.888z m-406.528-411.648c2.56 104.96 44.544 202.752 118.784 277.504 76.8 76.8 178.688 119.296 287.744 119.296 220.672 0 400.896-177.152 406.528-396.288-266.24 73.216-546.816 73.216-813.056-0.512z" fill="#2E66FF" p-id="2019"></path><path d="M339.456 822.272c-1.024 0-2.56-0.512-3.584-1.024-144.384-77.824-181.76-220.672-183.296-226.304-1.024-4.096 1.536-8.192 5.632-9.216 4.096-1.024 8.192 1.536 9.216 5.632 0.512 1.536 37.376 142.336 175.616 216.576 3.584 2.048 5.12 6.656 3.072 10.24-1.536 2.56-4.096 4.096-6.656 4.096z" fill="#FFF152" p-id="2020"></path><path d="M395.264 840.192m-13.312 0a13.312 13.312 0 1 0 26.624 0 13.312 13.312 0 1 0-26.624 0Z" fill="#FFF152" p-id="2021"></path><path d="M838.656 385.024c-3.072 0-6.144-2.048-7.168-4.608-0.512-1.536-55.808-136.192-202.24-191.488-4.096-1.536-6.144-6.144-4.608-9.728 1.536-4.096 6.144-6.144 9.728-4.608 153.6 57.856 208.896 194.56 211.456 200.704 1.536 4.096-0.512 8.192-4.096 9.728h-3.072z" fill="#C9E6FF" p-id="2022"></path><path d="M573.44 163.328m-13.312 0a13.312 13.312 0 1 0 26.624 0 13.312 13.312 0 1 0-26.624 0Z" fill="#C9E6FF" p-id="2023"></path></svg> <a href="game.html?id=2">GAME2</a><p></p></li>
                        <li><svg t="1692534472790" class="icon" viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="2007" width="32" height="32"><path d="M97.792 513.536c0-228.864 185.344-414.208 414.208-414.208s414.208 185.344 414.208 414.208c-270.848 77.312-557.568 77.312-828.416 0z" fill="#FFFFFF" p-id="2008"></path><path d="M512 579.072c-140.288 0-280.064-19.456-416.256-58.368l-5.632-1.536v-5.632c0-232.96 189.44-421.888 421.888-421.888s421.888 189.44 421.888 421.888v5.632l-5.632 1.536c-136.192 38.912-275.968 58.368-416.256 58.368zM105.472 507.904c266.24 74.752 547.328 74.752 813.056 0-3.072-221.696-184.32-400.896-406.528-400.896s-403.456 179.2-406.528 400.896z" fill="#2E66FF" p-id="2009"></path><path d="M330.24 520.704m-90.112 0a90.112 90.112 0 1 0 180.224 0 90.112 90.112 0 1 0-180.224 0Z" fill="#FFF152" p-id="2010"></path><path d="M330.24 615.936c-52.736 0-95.232-43.008-95.232-95.232 0-52.736 43.008-95.232 95.232-95.232s95.232 43.008 95.232 95.232c0.512 52.224-42.496 95.232-95.232 95.232z m0-180.736c-47.104 0-84.992 38.4-84.992 84.992 0 47.104 38.4 84.992 84.992 84.992 47.104 0 84.992-38.4 84.992-84.992 0.512-46.592-37.888-84.992-84.992-84.992z" fill="#2E66FF" p-id="2011"></path><path d="M519.168 510.464m-90.112 0a90.112 90.112 0 1 0 180.224 0 90.112 90.112 0 1 0-180.224 0Z" fill="#FFF152" p-id="2012"></path><path d="M519.168 605.696c-52.736 0-95.232-43.008-95.232-95.232s43.008-95.232 95.232-95.232c52.736 0 95.232 43.008 95.232 95.232s-42.496 95.232-95.232 95.232z m0-180.224c-47.104 0-84.992 38.4-84.992 84.992s38.4 84.992 84.992 84.992c47.104 0 84.992-38.4 84.992-84.992s-37.888-84.992-84.992-84.992z" fill="#2E66FF" p-id="2013"></path><path d="M699.904 510.464m-90.112 0a90.112 90.112 0 1 0 180.224 0 90.112 90.112 0 1 0-180.224 0Z" fill="#FFB5EC" p-id="2014"></path><path d="M699.904 605.696c-52.736 0-95.232-43.008-95.232-95.232s43.008-95.232 95.232-95.232c52.736 0 95.232 43.008 95.232 95.232s-42.496 95.232-95.232 95.232z m0-180.224c-47.104 0-84.992 38.4-84.992 84.992s38.4 84.992 84.992 84.992c47.104 0 84.992-38.4 84.992-84.992s-37.888-84.992-84.992-84.992z" fill="#2E66FF" p-id="2015"></path><path d="M420.864 353.28m-90.112 0a90.112 90.112 0 1 0 180.224 0 90.112 90.112 0 1 0-180.224 0Z" fill="#C9E6FF" p-id="2016"></path><path d="M420.864 448.512c-27.136 0-54.272-11.264-72.704-33.792-16.384-19.456-24.576-44.032-22.016-69.632s13.824-48.64 33.28-65.024c39.936-33.792 100.352-29.184 134.144 11.264 33.792 39.936 29.184 100.352-11.264 134.144-17.92 15.872-39.936 23.04-61.44 23.04z m-0.512-180.224c-19.456 0-38.912 6.656-54.784 19.968-35.84 30.208-40.448 83.968-10.24 119.808s83.968 40.448 119.808 10.24 40.448-83.968 10.24-119.808c-16.384-19.968-40.448-30.208-65.024-30.208z" fill="#2E66FF" p-id="2017"></path><path d="M97.792 510.464c0 228.864 185.344 414.208 414.208 414.208s414.208-185.344 414.208-414.208C655.36 587.776 368.64 587.776 97.792 510.464z" fill="#FFB5EC" p-id="2018"></path><path d="M512 932.352c-232.96 0-421.888-189.44-421.888-421.888v-10.24l9.728 2.56c269.824 76.8 555.008 76.8 824.32 0l9.728-2.56v10.24c0 232.96-188.928 421.888-421.888 421.888z m-406.528-411.648c2.56 104.96 44.544 202.752 118.784 277.504 76.8 76.8 178.688 119.296 287.744 119.296 220.672 0 400.896-177.152 406.528-396.288-266.24 73.216-546.816 73.216-813.056-0.512z" fill="#2E66FF" p-id="2019"></path><path d="M339.456 822.272c-1.024 0-2.56-0.512-3.584-1.024-144.384-77.824-181.76-220.672-183.296-226.304-1.024-4.096 1.536-8.192 5.632-9.216 4.096-1.024 8.192 1.536 9.216 5.632 0.512 1.536 37.376 142.336 175.616 216.576 3.584 2.048 5.12 6.656 3.072 10.24-1.536 2.56-4.096 4.096-6.656 4.096z" fill="#FFF152" p-id="2020"></path><path d="M395.264 840.192m-13.312 0a13.312 13.312 0 1 0 26.624 0 13.312 13.312 0 1 0-26.624 0Z" fill="#FFF152" p-id="2021"></path><path d="M838.656 385.024c-3.072 0-6.144-2.048-7.168-4.608-0.512-1.536-55.808-136.192-202.24-191.488-4.096-1.536-6.144-6.144-4.608-9.728 1.536-4.096 6.144-6.144 9.728-4.608 153.6 57.856 208.896 194.56 211.456 200.704 1.536 4.096-0.512 8.192-4.096 9.728h-3.072z" fill="#C9E6FF" p-id="2022"></path><path d="M573.44 163.328m-13.312 0a13.312 13.312 0 1 0 26.624 0 13.312 13.312 0 1 0-26.624 0Z" fill="#C9E6FF" p-id="2023"></path></svg> <a href="game.html?id=3">GAME3</a></li>
                    </ul>
                </div>
                
                <svg version="1.1" id="blob"xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink">
                    <path id="blob-path" d="M60,500H0V0h60c0,0,20,172,20,250S60,900,60,500z"/>
                </svg>
            </div>
    `
})