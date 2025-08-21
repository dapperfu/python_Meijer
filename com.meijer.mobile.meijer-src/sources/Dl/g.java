package Dl;

import android.net.Uri;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000e¨\u0006\u000f"}, d2 = {"LDl/g;", "", "", "scheme", "authority", "fallbackAuthority", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/net/Uri;", "universalDeepLink", "c", "(Landroid/net/Uri;)Landroid/net/Uri;", "b", "a", "Ljava/lang/String;", "featurenavigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String scheme;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String authority;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String fallbackAuthority;

    public g(String scheme, String authority, String fallbackAuthority) {
        Intrinsics.j(scheme, "scheme");
        Intrinsics.j(authority, "authority");
        Intrinsics.j(fallbackAuthority, "fallbackAuthority");
        this.scheme = scheme;
        this.authority = authority;
        this.fallbackAuthority = fallbackAuthority;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence d(String it) {
        Intrinsics.j(it, "it");
        Locale ROOT = Locale.ROOT;
        Intrinsics.i(ROOT, "ROOT");
        return StringsKt.z(it, ROOT);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.net.Uri c(android.net.Uri r34) {
        /*
            Method dump skipped, instructions count: 1334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Dl.g.c(android.net.Uri):android.net.Uri");
    }

    public final Uri b(Uri universalDeepLink) {
        Uri uriC = c(universalDeepLink);
        if (uriC == null) {
            return Uri.parse(this.scheme + "://" + this.fallbackAuthority);
        }
        return uriC;
    }
}
