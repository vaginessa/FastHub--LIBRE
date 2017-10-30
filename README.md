[![Releases](https://img.shields.io/github/release/thermatk/FastHub-Libre.svg)](https://github.com/thermatk/FastHub-Libre/releases/latest)

# FastHub-Libre

This is a foss-friendly fork of FastHub

## Changes
- Cleaned from blobs
- Notifications work using native JobScheduler without any push messaging involved, although the minimum supported update interval becomes 20 minutes
- It's possible to unlock features, if needed, in a manner which nudges to still try to find a way and support upstream developers. **Once again, please find a way to financially support upstream developers**. If you, just as me, haven't found any other option than to use the in-app purchases in the upstream app, maybe do it from a friend's device!
- Rebranded in some most obvious places to indicate that "FastHub-Libre" is not exactly "FastHub"
- Ready to be built and included in the F-Droid store

## Why fork and change these bits? (As of October 2017)

- **Technical reasons**
  - Upstream developers will never be able to comply with the [F-Droid's inclusion policy](https://f-droid.org/docs/Inclusion_Policy/?title=Inclusion_Policy) 
- **Ideological reasons**
  - Upstream developers get offended by the high standards of the F-Droid community, which inevitably result in an _Anti-Feature: Non-Free Network_ badge for any Github client
  - Upstream developers don't adequately account for users of Android devices without GMS
  - Upstream app has some _PRO_-features. Users without GMS have no way to unlock these features, turning the software into unfixable crippleware
  - Upstream developers have shown in the past that they lack a general understanding of the GPL
  - Upstream developers strongly disapprove that in this fork one can access the _PRO_ features without paying
  	- This fork will have to carry on without approval until a better solution will surface
  	- The unlocking page and the way to this page is made respective and nudging to go and support

![Logo](/.github/assets/feature_graphic.png?raw=true "Logo")

# FastHub

Yet another **open-source** GitHub client app but unlike any other app, FastHub was built from scratch.

## Download

_(To download the app from here, please look at the [latest release](https://github.com/thermatk/FastHub-Libre/releases/latest).)_

## Features  
- **App**
  - Three login types (Basic Auth), (Access Token) or via (OAuth)
  - Multiple Accounts
  - Enterprise Accounts
  - Themes mode
  - Offline-mode
  - Markdown and code highlighting support
  - Notifications overview and "Mark all as read"
  - Search Users/Orgs, Repos, Issues/PRs & Code.
  - FastHub & GitHub Pinned Repos
  - Trending
  - Wiki
  - Projects
- **Repositories**
  - Browse & Read Wiki
  - Edit, Create & Delete files (commit)
  - Edit, Create & Delete files (Project Columns Cards)
  - Search Repos
  - Browse and search Repos
  - See your public, private and forked Repos
  - Filter Branches and Commits
  - Watch, star and fork Repos
  - Download releases, files and branches
- **Issues and Pull Requests**
  - Search Issues/PRs
  - Filter Issues/PRs
  - Long click to peak Issues/PRs & add comments otg.
  - Open/close Issues/PRs
  - Comment on Issues/PRs
  - Manage Issue/PR comments
  - React to comments with reactions
  - Edit Issues/PRs
  - Lock/unlock conversation in Issues/PRs
  - Assign people and add Labels and Milestones to Issues/PRs
  - Manage Milestones
  - Merge PRs
  - PRs reviews (reply, react with emojies, delete & edit comment)
  - PRs request review changes/approve & comment.
  - PRs statuses
- **Commits and Gists**
  - Search Code/Gists
  - View Gists and their files
  - Comment on Commits/Gists
  - Manage Commit/Gist comments
  - Create/Delete Gists
  - Edit Gist & Gist Files
  - React to Commit comments with reactions
  - Comment on line number in Files/Code changes.
- **Organisations**
    - Overview
    - Feeds
    - Teams & Teams repos
    - Repos
- **Users**
  - GitHub Pinned Repos 
  - Follow/Unfollow users
  - View user feeds
  - Contribution graph.
  - Search Users, Repos, Issues,Pull Requests and Code
- _**Much more...**_
  - _FastHub is actively developed. More features will come!_

## Specs / Open-source libraries:

- Minimum **SDK 21**, _but AppCompat is used all the way ;-)_
- [**Kotlin**](https://github.com/JetBrains/kotlin) all new modules starting from 2.5.3 will be written in **#Kotlin**.
- **MVP**-architecture: [**ThirtyInch**](https://github.com/grandcentrix/ThirtyInch) because its ThirtyInch.
- [**RxJava2**](https://github.com/ReactiveX/RxJava) & [**RxAndroid**](https://github.com/ReactiveX/RxAndroid) for Retrofit & background threads
- [**Retrofit**](https://github.com/square/retrofit) for constructing the REST API
- [**Requery**](https://github.com/requery/requery/) for offline-mode
- [**Stream API**](https://github.com/aNNiMON/Lightweight-Stream-API) for dealing with `Collections`
- [**ButterKnife**](https://github.com/JakeWharton/butterknife) for view binding
- [**Android State**](https://github.com/evernote/android-state) for saving instance states
- [**Lombok**](https://projectlombok.github.io) for getters and setters
- [**Material-BottomNavigation**](https://github.com/sephiroth74/Material-BottomNavigation) for `BottomBar` tabs
- [**Glide**](https://github.com/bumptech/glide) for loading images
- [**commonmark**](https://github.com/atlassian/commonmark-java) for _Markdown_ conversion to html
- [**Toasty**](https://github.com/GrenderG/Toasty) for displaying error/success messages
- [**ShapedImageView**](https://github.com/gavinliu/ShapedImageView) for round avatars
- [**Material-About-Library**](https://github.com/daniel-stoneuk/material-about-library) for the about screen
- **Android Support Libraries**, the almighty ;-)

## Language Contributors

<details>
  <summary>Thanks for those who contributed to FastHub by adding their language</summary>
      
  <p>- Chinese (Simplified) <a href="https://github.com/devifish">@Devifish</a></p>
  <p>- Chinese (Traditional) <a href="https://github.com/maple3142">@maple3142</a></p>
  <p>- German <a href="https://github.com/failex234">@failex234</a></p>
  <p>- Indonesian <a href="https://github.com/dikiaap">@dikiaap</a></p>
  <p>- Italian <a href="https://github.com/Raffaele74">@Raffaele74</a></p>
  <p>- Japanese <a href="https://github.com/Rintan">@Rintan</a></p>
  <p>- Lithuanian <a href="https://github.com/mistermantas">@mistermantas</a></p>
  <p>- Russian <a href="https://github.com/dedepete">@dedepete</a></p>
  <p>- Turkish <a href="https://github.com/kutsan">@kutsan</a></p>
  <p>- Portuguese <a href="https://github.com/caiorrs">@caiorrs</a></p>
  <p>- Czech <a href="https://github.com/hejsekvojtech">@hejsekvojtech</a></p>
  <p>- Spanish <a href="https://github.com/alete89">@alete89</a></p>
  <p>- French <a href="https://github.com/ptt-homme">@ptt-homme</a></p>
  <p>- Korean <a href="https://github.com/Astro36">@Astro36</a> <a href="https://github.com/cozyplanes">@cozyplanes</a></p> 
</details>

## FAQ

<details>
  <summary>Why can't I see my <b>Organizations</b> either <i>Private</i> or <i>Public</i> ones?</summary>
  <p>Open up https://github.com/settings/applications and look for FastHub, open it then scroll to Organization access and click on Grant Button,
  alternatively login via <b>Access Token</b> which will ease this setup.</p>
</details>

<details>
  <summary>I tried to login via Access Token & OTP but why isn't it working?</summary>
  <p>You can't login via Access Token & OTP all together due to the lifetime of the OTP code, you'll be required to login in every few seconds.</p>
</details>

<details>
  <summary>Why are my Private Repo and Enterprise Wiki not showing up?</summary>
  <p>It's due to FastHub scraping GitHub Wiki page & Private Repos require session token that FastHub doesn't have.</p>
</details>

<details>
  <summary>I login with Enterprise account but can't interact with anything other than my Enterprise GitHub.</summary>
  <p>Well, logically, you can't access anything else other than your Enterprise, but FastHub made that possible but can't do much about it, in most cases since your login credential doesn't exists in GitHub server. But in <b>few</b> cases your GitHub account Oauth token will do the trick.</p>
</details>

<details>
  <summary>Why am I having problems editing Issues/PRs?</summary>
  <p>If you are unable to edit an issue in a public organization, please contact your Organization Admin to grant access to FastHub. Alternatively you can login using an Access Token with the correct permissions granted.</p>
</details>

<details>
  <summary>I'm having this issue! / I want this and that!</summary>
  <p>Head to https://github.com/k0shk0sh/FastHub/issues/new and create new issue for bugs or feature requests. I really encourage you to search before opening a ticket. Any duplicate request will result in it being closed immediately.</p>
</details>

<details>
  <summary>How do I get PROMO CODE?</summary>
  <p>Please refer to the in-app FAQ for details.</p>
</details>


## License

Upstream:
> Copyright (C) 2017 Kosh.  
> Licensed under the [GPL-3.0](https://www.gnu.org/licenses/gpl.html) license.  
> (See the [LICENSE](https://github.com/k0shk0sh/FastHub/blob/master/LICENSE) file for the whole license text.)

Libre fork changes:
> Copyright (C) 2017 Ruslan Boitsov.
> Licensed under the [GPL-3.0](https://www.gnu.org/licenses/gpl.html) license.

## Screenshots

| Feeds | Drawer |
|:-:|:-:|
| ![First](/.github/assets/first.png?raw=true) | ![Sec](/.github/assets/sec.png?raw=true) |

| Repo | Profile |
|:-:|:-:|
| ![Third](/.github/assets/third.png?raw=true) | ![Fourth](/.github/assets/fourth.png?raw=true) |

## FastHub Logo

**FastHub** logo is designed by **Cookicons**.  
[Google+](https://plus.google.com/+CookiconsDesign) | [Twitter](https://twitter.com/mcookie)  
Designer website [Cookicons](https://cookicons.co/).  

**OLD FastHub** logo was designed by **Kevin Aguilar**.  
[Google+](https://plus.google.com/+KevinAguilarC) | [Twitter](https://twitter.com/kevttob)  
Designer at [Kevin Aguilar](http://kevaguilar.com/).  
Laus Deo Semper
