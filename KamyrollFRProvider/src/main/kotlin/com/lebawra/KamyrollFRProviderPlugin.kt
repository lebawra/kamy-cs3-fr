// https://github.com/Stormunblessed/kamy-cs3
package com.lebawra

import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin
import android.content.Context
import com.lagradost.cloudstream3.animeproviders.KamyrollFRProvider

@CloudstreamPlugin
class KamyrollFRProviderPlugin: Plugin() {
    override fun load(context: Context) {
        // All providers should be added in this manner. Please don't edit the providers list directly.
        registerMainAPI(KamyrollFRProvider())
    }
}