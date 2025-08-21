package ka;

import T8.a;
import android.app.Activity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import u9.C17361a;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0016\u0010\b\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001b\u0010\"R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001c\u0010%R\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u0019\u0010(¨\u0006)"}, d2 = {"Lka/m;", "LT8/a;", "Lka/l;", "overlayInAppPresenter", "", "campaignId", "html", "sid", "url", "Lu9/a;", "timestampProvider", "", "priority", "", "repeatable", "LT8/a$a;", "triggeringLifecycle", "<init>", "(Lka/l;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lu9/a;IZLT8/a$a;)V", "Landroid/app/Activity;", "activity", "", "a", "(Landroid/app/Activity;)V", "Lka/l;", "b", "Ljava/lang/String;", "c", "d", "e", "f", "Lu9/a;", "g", "I", "()I", "h", "Z", "()Z", "i", "LT8/a$a;", "()LT8/a$a;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class m implements T8.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l overlayInAppPresenter;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String campaignId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String html;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String sid;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String url;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final C17361a timestampProvider;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int priority;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean repeatable;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final a.EnumC0795a triggeringLifecycle;

    public m(l overlayInAppPresenter, String campaignId, String html, String str, String str2, C17361a timestampProvider, int i10, boolean z10, a.EnumC0795a triggeringLifecycle) {
        Intrinsics.j(overlayInAppPresenter, "overlayInAppPresenter");
        Intrinsics.j(campaignId, "campaignId");
        Intrinsics.j(html, "html");
        Intrinsics.j(timestampProvider, "timestampProvider");
        Intrinsics.j(triggeringLifecycle, "triggeringLifecycle");
        this.overlayInAppPresenter = overlayInAppPresenter;
        this.campaignId = campaignId;
        this.html = html;
        this.sid = str;
        this.url = str2;
        this.timestampProvider = timestampProvider;
        this.priority = i10;
        this.repeatable = z10;
        this.triggeringLifecycle = triggeringLifecycle;
    }

    @Override // T8.a
    public void a(Activity activity) {
        this.overlayInAppPresenter.e(this.campaignId, this.sid, this.url, null, this.timestampProvider.a(), this.html, null);
    }

    @Override // T8.a
    /* renamed from: b, reason: from getter */
    public a.EnumC0795a getTriggeringLifecycle() {
        return this.triggeringLifecycle;
    }

    @Override // T8.a
    /* renamed from: c, reason: from getter */
    public int getPriority() {
        return this.priority;
    }

    @Override // T8.a
    /* renamed from: d, reason: from getter */
    public boolean getRepeatable() {
        return this.repeatable;
    }

    public /* synthetic */ m(l lVar, String str, String str2, String str3, String str4, C17361a c17361a, int i10, boolean z10, a.EnumC0795a enumC0795a, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(lVar, str, str2, str3, str4, c17361a, (i11 & 64) != 0 ? 900 : i10, (i11 & 128) != 0 ? false : z10, (i11 & 256) != 0 ? a.EnumC0795a.f35935c : enumC0795a);
    }
}
