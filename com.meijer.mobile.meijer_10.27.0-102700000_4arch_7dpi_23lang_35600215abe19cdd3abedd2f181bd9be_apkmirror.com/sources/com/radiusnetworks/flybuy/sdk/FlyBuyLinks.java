package com.radiusnetworks.flybuy.sdk;

import androidx.annotation.Keep;
import com.medallia.digital.mobilesdk.q2;
import com.radiusnetworks.flybuy.sdk.data.links.LinkDetails;
import com.radiusnetworks.flybuy.sdk.data.links.LinkType;
import com.radiusnetworks.flybuy.sdk.manager.builder.OrderOptions;
import com.radiusnetworks.flybuy.sdk.util.UrlExtensionKt;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.text.MatchGroup;
import kotlin.text.MatchGroupCollection;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;
import qv.C16646j;

@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\t\u001a\u00020\u0004H\u0002J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0002J&\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\t\u001a\u00020\u0004H\u0002J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0002J\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0002J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/FlyBuyLinks;", "", "()V", "DEFAULT_CUSTOMER_NAME", "", "handleDineInLink", "Lcom/radiusnetworks/flybuy/sdk/data/links/LinkDetails;", "params", "", "url", "handleMobileLink", "handleRedemptionLink", "handleShortLink", "parse", "recursivelyParse", "resolveRedirect", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class FlyBuyLinks {
    private static final String DEFAULT_CUSTOMER_NAME = "Unknown";
    public static final FlyBuyLinks INSTANCE = new FlyBuyLinks();

    private FlyBuyLinks() {
    }

    private final LinkDetails handleDineInLink(Map<String, String> params, String url) {
        OrderOptions.Builder builder = new OrderOptions.Builder(DEFAULT_CUSTOMER_NAME);
        String str = params.get("pt");
        if (str != null) {
            builder.setPickupType(str);
        }
        String str2 = params.get("si");
        if (str2 != null) {
            builder.setSpotIdentifier(str2);
        }
        return new LinkDetails(url, LinkType.DINE_IN, builder, params);
    }

    private final LinkDetails handleMobileLink(String url) throws UnsupportedEncodingException {
        MatchGroupCollection groups;
        MatchGroup matchGroup;
        URL url2 = new URL(url);
        MatchResult matchResultD = Regex.d(new Regex("/[ms]/([a-z\\d_/]+)", (Set<? extends RegexOption>) SetsKt.d(RegexOption.f147463c)), url, 0, 2, null);
        IntRange range = (matchResultD == null || (groups = matchResultD.getGroups()) == null || groups.size() <= 1 || (matchGroup = groups.get(1)) == null) ? null : matchGroup.getRange();
        String strG1 = range != null ? StringsKt.g1(url, range) : null;
        Map<String, String> mapQueryParameters = UrlExtensionKt.queryParameters(url2);
        if (Intrinsics.e(strG1, "o")) {
            return handleRedemptionLink(mapQueryParameters, url);
        }
        if (Intrinsics.e(strG1, "d")) {
            return handleDineInLink(mapQueryParameters, url);
        }
        return null;
    }

    private final LinkDetails handleRedemptionLink(Map<String, String> params, String url) {
        if (!params.containsKey("r")) {
            return null;
        }
        return new LinkDetails(url, LinkType.REDEMPTION, new OrderOptions.Builder(DEFAULT_CUSTOMER_NAME), params);
    }

    private final LinkDetails recursivelyParse(String url) throws InterruptedException {
        LinkDetails linkDetailsHandleMobileLink;
        String path = new URL(url).getPath();
        Intrinsics.i(path, "getPath(...)");
        for (String str : StringsKt.a1(path, new String[]{q2.f92724c}, false, 0, 6, null)) {
            if (!Intrinsics.e(str, "")) {
                LinkDetails linkDetails = new LinkDetails(url, LinkType.OTHER, null, MapsKt.k());
                if (Intrinsics.e(str, "s")) {
                    LinkDetails linkDetailsHandleShortLink = handleShortLink(url);
                    if (linkDetailsHandleShortLink != null) {
                        return linkDetailsHandleShortLink;
                    }
                } else if (Intrinsics.e(str, "m") && (linkDetailsHandleMobileLink = handleMobileLink(url)) != null) {
                    return linkDetailsHandleMobileLink;
                }
                return linkDetails;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String resolveRedirect(String url) throws InterruptedException {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        C16646j.b(null, new f(objectRef, url, null), 1, null);
        return (String) objectRef.f142835a;
    }

    public final LinkDetails parse(String url) throws Exception {
        Intrinsics.j(url, "url");
        try {
            return INSTANCE.recursivelyParse(url);
        } catch (Exception e10) {
            FlyBuyCore.INSTANCE.getCrashManager().reportCrash(e10);
            throw e10;
        }
    }

    private final LinkDetails handleShortLink(String url) throws InterruptedException {
        String strResolveRedirect = resolveRedirect(url);
        if (strResolveRedirect != null && !Intrinsics.e(strResolveRedirect, url)) {
            return INSTANCE.recursivelyParse(strResolveRedirect);
        }
        return null;
    }
}
