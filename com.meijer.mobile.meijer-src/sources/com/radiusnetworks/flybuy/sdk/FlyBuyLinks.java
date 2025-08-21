package com.radiusnetworks.flybuy.sdk;

import androidx.annotation.Keep;
import com.medallia.digital.mobilesdk.q2;
import com.radiusnetworks.flybuy.sdk.data.links.LinkDetails;
import com.radiusnetworks.flybuy.sdk.data.links.LinkType;
import com.radiusnetworks.flybuy.sdk.data.push.FlybuyPushData;
import com.radiusnetworks.flybuy.sdk.manager.builder.OrderOptions;
import com.radiusnetworks.flybuy.sdk.util.UrlExtensionKt;
import j$.net.URLDecoder;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
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
import mv.C15807j;

@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\t\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0002J$\u0010\u000b\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\t\u001a\u00020\u0004H\u0002J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0002J\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u0004J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0002J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/FlyBuyLinks;", "", "()V", "DEFAULT_CUSTOMER_NAME", "", "handleDineInLink", "Lcom/radiusnetworks/flybuy/sdk/data/links/LinkDetails;", "params", "", "url", "handleMobileLink", "handleRedemptionLink", "handleShortLink", "parse", "parseReferrerUrl", "referrerUrl", "recursivelyParse", "resolveRedirect", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class FlyBuyLinks {
    private static final String DEFAULT_CUSTOMER_NAME = "Unknown";
    public static final FlyBuyLinks INSTANCE = new FlyBuyLinks();

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
        MatchResult matchResultD = Regex.d(new Regex("/[ms]/([a-z\\d_/]+)", (Set<? extends RegexOption>) SetsKt.d(RegexOption.f148370c)), url, 0, 2, null);
        IntRange range = (matchResultD == null || (groups = matchResultD.getGroups()) == null || groups.size() <= 1 || (matchGroup = groups.get(1)) == null) ? null : matchGroup.getRange();
        String strK1 = range != null ? StringsKt.k1(url, range) : null;
        Map<String, String> mapQueryParameters = UrlExtensionKt.queryParameters(url2);
        return Intrinsics.e(strK1, "o") ? handleRedemptionLink(mapQueryParameters, url) : Intrinsics.e(strK1, "d") ? handleDineInLink(mapQueryParameters, url) : new LinkDetails(url, LinkType.OTHER, null, MapsKt.k());
    }

    private final LinkDetails handleRedemptionLink(Map<String, String> params, String url) {
        if (!params.containsKey("r")) {
            return new LinkDetails(url, LinkType.OTHER, null, MapsKt.k());
        }
        return new LinkDetails(url, LinkType.REDEMPTION, new OrderOptions.Builder(DEFAULT_CUSTOMER_NAME), params);
    }

    private final LinkDetails recursivelyParse(String url) {
        String path = new URL(url).getPath();
        Intrinsics.i(path, "getPath(...)");
        for (String str : StringsKt.b1(path, new String[]{q2.f93563c}, false, 0, 6, null)) {
            if (!Intrinsics.e(str, "")) {
                return Intrinsics.e(str, "s") ? handleShortLink(url) : Intrinsics.e(str, "m") ? handleMobileLink(url) : new LinkDetails(url, LinkType.OTHER, null, MapsKt.k());
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String resolveRedirect(String url) throws InterruptedException {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        C15807j.b(null, new g(objectRef, url, null), 1, null);
        return (String) objectRef.f143742a;
    }

    public final LinkDetails parse(String url) {
        Intrinsics.j(url, "url");
        try {
            return recursivelyParse(url);
        } catch (Exception unused) {
            return new LinkDetails(url, LinkType.OTHER, null, MapsKt.k());
        }
    }

    public final LinkDetails parseReferrerUrl(String referrerUrl) {
        Object next;
        Object next2;
        List listA1;
        String str;
        List listA12;
        Intrinsics.j(referrerUrl, "referrerUrl");
        List listA13 = StringsKt.a1(referrerUrl, new char[]{'&'}, false, 0, 6, null);
        Iterator it = listA13.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (StringsKt.W((String) next, "utm_source", false, 2, null)) {
                break;
            }
        }
        String str2 = (String) next;
        String str3 = (str2 == null || (listA12 = StringsKt.a1(str2, new char[]{'='}, false, 0, 6, null)) == null) ? null : (String) CollectionsKt.F0(listA12);
        Iterator it2 = listA13.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (StringsKt.W((String) next2, "utm_content", false, 2, null)) {
                break;
            }
        }
        String str4 = (String) next2;
        String strDecode = (str4 == null || (listA1 = StringsKt.a1(str4, new char[]{'='}, false, 2, 2, null)) == null || (str = (String) CollectionsKt.F0(listA1)) == null) ? null : URLDecoder.decode(str, "UTF-8");
        if (!Intrinsics.e(str3, FlybuyPushData.MESSAGE_SOURCE_FLYBUY)) {
            return null;
        }
        return recursivelyParse("https://" + strDecode);
    }

    private FlyBuyLinks() {
    }

    private final LinkDetails handleShortLink(String url) throws InterruptedException {
        LinkDetails linkDetails;
        String strResolveRedirect = resolveRedirect(url);
        if (strResolveRedirect != null) {
            if (!Intrinsics.e(strResolveRedirect, url)) {
                linkDetails = INSTANCE.recursivelyParse(strResolveRedirect);
            } else {
                linkDetails = new LinkDetails(url, LinkType.OTHER, null, MapsKt.k());
            }
            if (linkDetails != null) {
                return linkDetails;
            }
        }
        return new LinkDetails(url, LinkType.OTHER, null, MapsKt.k());
    }
}
