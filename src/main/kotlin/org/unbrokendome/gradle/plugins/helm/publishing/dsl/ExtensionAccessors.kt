package org.unbrokendome.gradle.plugins.helm.publishing.dsl

import org.gradle.api.NamedDomainObjectContainer
import org.unbrokendome.gradle.plugins.helm.dsl.HelmExtension
import org.unbrokendome.gradle.plugins.helm.publishing.HELM_PUBLISHING_EXTENSION_NAME
import org.unbrokendome.gradle.plugins.helm.publishing.HELM_PUBLISHING_REPOSITORIES_EXTENSION_NAME
import org.unbrokendome.gradle.plugins.helm.util.requiredExtension


/**
 * Gets the `publishing` sub-extension.
 */
val HelmExtension.publishing: HelmPublishingExtension
    get() = requiredExtension(HELM_PUBLISHING_EXTENSION_NAME)


/**
 * Gets the `publishing.repositories` sub-extension.
 */
val HelmPublishingExtension.repositories: NamedDomainObjectContainer<HelmPublishingRepository>
    get() = requiredExtension(HELM_PUBLISHING_REPOSITORIES_EXTENSION_NAME)
