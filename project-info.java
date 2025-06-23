project nl.adamg.example {
    group nl.adamg;
    www https://adamg.nl/baizel-example-project;
    git https://github.com/adamg-nl/baizel-example-project.git;
    license "SPDX-License-Identifier: GPL-3.0-only"\u003Blink="https://opensource.org/license/gpl-3-0";
    repository maven https://repo1.maven.org/maven2/;

    dependencies {
        com.google.code.findbugs:jsr305:3.0.2 { jsr305; }
    }
}
