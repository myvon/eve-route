
## next

- Added login statistics.
- Fixed database migrations for H2

## 0.4.1

2020-11-02

- New: For each release, the fat JAR and WAR files are now built and can be downloaded from GitHub.
- Small text and usability improvements.
- Fixed check for supported browsers.

## 0.4.0

2020-10-24

- Triglavian Invasion: Updated gates and systems.
- Change: The map now sticks on top, and it's height is set automatically based on the viewport height.
- [#4][i4] Moved navigation buttons to header (removes secondary bar).
- Other small layout improvements.
- Validation of the OAuth state param and better error handling.
- [#9][i9] Wrong in-game route: Added small delay between requests and debug messages.
- [#7][i7] Docker containers for a complete development environment added.
- Added Dockerfile to run the jar file.

[i9]: https://github.com/tkhamez/eve-route/issues/9
[i7]: https://github.com/tkhamez/eve-route/issues/7
[i4]: https://github.com/tkhamez/eve-route/issues/4

## 0.3.1

2020-10-02

- Fix: Clicking "swap systems" only switched the input values, it did not change the start and end systems
  for the route.
- Improved error handling when setting the in-game route.

## 0.3.0

2020-09-27

- Added button to set the start system back to the current location.
- Added button to swap start and end systems. (thanks [@NevarrTivianne](https://github.com/NevarrTivianne))
- Added number of jumps to route list.
- Added the option to change the map height so that it fits better into the respective viewport.
- The buttons to avoid the start and end system of a route have been removed.
- Other small layout improvements.
- Map: Added title (on mouse over) to systems.
- Map: Connections are redrawn when a temporary connection has been added or removed.
- Fixed alliance check during login.
- Added CSRF protection for all requests that change data.
- Added option to enable the "secure" flag for the session cookie.
- Added database migrations.
- More efficient storage of Ansiblex gates in the database.
- Some cleanups, library updates and improved documentation.

## 0.2.0

2020-09-20

- [#3][i3] Added support for PostgreSQL, MySQL, MariaDB, SQLite and H2 (embedded mode) databases.
- User is logged off from the frontend if the backend responds with a "Forbidden" error.
- Fixed some MongoDB operations.

[i3]: https://github.com/tkhamez/eve-route/issues/3

## 0.1.0

2020-09-19

First release.
