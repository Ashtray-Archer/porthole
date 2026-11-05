# Charcoal Porthole

Shared launch/dialog/system-bar resources are exact copies of android-NDK
`e8b67dfc67776c2b8da919785d15f38d68c91db0`, verified by its canonical Grease
copy guard. The application explicitly chooses that window theme.

The existing Compose theme defaults to dark charcoal and disables wallpaper
colors by default. Its existing explicit light/dynamic override parameters are
retained; the sole Activity caller uses the fixed defaults. No new Kotlin/Java
file, framework, Gradle plugin or UI architecture is introduced. Existing
surfaces, text, borders and two filled buttons use the fixed neutral roles.
The connected/warning/error signal remains semantic colored ink on a dark
status surface, preserving labels, time thresholds and actions with readable
contrast. App-owned WebView error HTML and the initial WebView clear use the
same palette. Captive-portal website content is not inverted or recolored.

Session isolation, VPN exclusion policy, address allowlist, credentials,
notifications, cookie destruction, navigation and timeout behavior are unchanged.
The current build, unit tests, lint and actual API29/API34 visual/lifecycle
acceptance must run. The inherited debug build uses a local ephemeral key;
no preserved private signing identity is available for a C67 upgrade. No key
is borrowed or substituted. All physical C67 checks are NOT_RUN.
No merge, release, portal login, network-setting change or installed-app
replacement is performed.
