# Context 

This is a fork of the probably discontinued [Atlassian IDE Connector for Eclipse|https://bitbucket.org/atlassian/connector-eclipse] which work on Eclipse 4.8.

# Target JIRA platforms

The connector has been lightly tested with JIRA 6.3.1 on-premise and Atlassian Cloud.

# Usage

Create a task repository from Mylyn dedicated view "Tasks repositories".

If you want to use Atlassian Cloud, create and use an API token as the password in the configuration of the task repository: [API tokens](https://confluence.atlassian.com/cloud/api-tokens-938839638.html)

# Build from source

The release should work but the source is probably not ready to use, one have to add the target Eclipse Platform the [Mylyn bundles|http://mirror.switch.ch/eclipse/mylyn/drops/3.24.1/v20180619-2220/mylyn-3.24.1.v20180619-2220.zip] in order to export the JIRA connector feature from Eclipse.

# Roadmap

- Remove all the unpackaged plugins of the connector, keep only JIRA related ones (and stash/bitbucket, confluence if it is worth it).