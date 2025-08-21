package ft;

import at.InterfaceC6294a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000 \u00112\u00020\u0001:\u0001\tB#\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\t\u0010\u0010¨\u0006\u0012"}, d2 = {"Lft/a;", "Lat/a;", "", "queryIntentServicesFlags", "", "", "preferredBrowsers", "<init>", "(ILjava/util/List;)V", "a", "I", "b", "()I", "setQueryIntentServicesFlags", "(I)V", "Ljava/util/List;", "()Ljava/util/List;", "c", "web-authentication-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: ft.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14254a implements InterfaceC6294a {

    /* renamed from: c, reason: collision with root package name */
    private static final C2109a f133641c = new C2109a(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int queryIntentServicesFlags;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<String> preferredBrowsers;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lft/a$a;", "", "<init>", "()V", "", "CHROME_STABLE", "Ljava/lang/String;", "CHROME_SYSTEM", "CHROME_BETA", "web-authentication-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ft.a$a, reason: collision with other inner class name */
    private static final class C2109a {
        public /* synthetic */ C2109a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2109a() {
        }
    }

    public C14254a(int i10, List<String> preferredBrowsers) {
        Intrinsics.j(preferredBrowsers, "preferredBrowsers");
        this.queryIntentServicesFlags = i10;
        this.preferredBrowsers = preferredBrowsers;
    }

    public final List<String> a() {
        return this.preferredBrowsers;
    }

    /* renamed from: b, reason: from getter */
    public final int getQueryIntentServicesFlags() {
        return this.queryIntentServicesFlags;
    }

    public /* synthetic */ C14254a(int i10, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? CollectionsKt.s("com.android.chrome", "com.google.android.apps.chrome", "com.android.chrome.beta") : list);
    }
}
