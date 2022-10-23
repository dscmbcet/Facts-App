# Add a fact to the app and then open a PR

## Points to note

- No spam
- Don't post duplicate facts
- Ensure the fact you're posting is decent and SFW

## Steps to add fact to app
<br>

![image](https://user-images.githubusercontent.com/89800551/197380768-6db6ebdd-7187-4811-bf2f-4277b9b0c655.png)

<br> 

Find a good fact, its source, and an image related to it. Pass the fact as a string to `info`, source to `source` , and after adding image to Android Studio using Resource Manager, the image resource id to `imageId` . Also pass the `type` of the fact as one of the following types depending on relevence: 

<br>

![image](https://user-images.githubusercontent.com/89800551/197380979-dd9f9534-b946-4d4d-8370-ac06e1aba9a7.png)

<br>

Finally pass your GitHub user id as the `submittedBy` parameter.

#### All these must be passed to the list in Datasource.kt file wrapped in the object of data class `Fact`

## How to make Changes

1. Fork the repository.

- Using GitHub Desktop:

  - [Getting started with GitHub Desktop](https://docs.github.com/en/desktop/installing-and-configuring-github-desktop/getting-started-with-github-desktop) will guide you through setting up Desktop.
  - Once Desktop is set up, you can use it to [fork the repo](https://docs.github.com/en/desktop/contributing-and-collaborating-using-github-desktop/cloning-and-forking-repositories-from-github-desktop)!

- Using the command line:

  - [Fork the repo](https://docs.github.com/en/github/getting-started-with-github/fork-a-repo#fork-an-example-repository) so that you can make your changes without affecting the original project until you're ready to merge them.

### Commit your update

Commit the changes once you are happy with them.

### Pull Request

When you're finished with the changes, create a pull request, also known as a PR.

- Fill the PR template so that we can review your PR. This template helps reviewers understand your changes as well as the purpose of your pull request.
- Ensure **Allow edits by maintainers** is ticked
- Once you submit your PR, a team member will review your proposal. We may ask questions or request for additional information.
- If any changes are required make it accordingly to the same PR
- If you run into any merge issues, checkout this [Resolving Conflicts](https://www.youtube.com/watch?v=JtIX3HJKwfo) to help you resolve merge conflicts and other issues.

### Your PR is merged!
