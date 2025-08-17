package ja;

import android.os.Bundle;
import com.emarsys.mobileengage.iam.dialog.IamDialog;
import e9.d;
import ia.f;
import io.constructor.data.local.PreferencesHelper;
import java.util.List;
import ka.C15128c;
import ka.InterfaceC15126a;
import ka.e;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import oa.C16008a;
import ra.C16739d;
import s9.C16914a;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0017\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0012¢\u0006\u0004\b\u0012\u0010\u0013J5\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\r\u001a\u00020\f8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lja/c;", "", "Ll9/b;", "concurrentHandlerHolder", "Ls9/a;", "timestampProvider", "Lia/f;", "inAppInternal", "Le9/c;", "Loa/a;", "Le9/d;", "displayedIamRepository", "Lra/d;", "webViewProvider", "<init>", "(Ll9/b;Ls9/a;Lia/f;Le9/c;Lra/d;)V", "", "Lka/a;", "a", "()Ljava/util/List;", "", "campaignId", "sid", "url", "requestId", "Lcom/emarsys/mobileengage/iam/dialog/IamDialog;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/emarsys/mobileengage/iam/dialog/IamDialog;", "Ll9/b;", "Ls9/a;", "c", "Lia/f;", "d", "Le9/c;", "e", "Lra/d;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l9.b concurrentHandlerHolder;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C16914a timestampProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final f inAppInternal;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final e9.c<C16008a, d> displayedIamRepository;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final C16739d webViewProvider;

    public c(l9.b concurrentHandlerHolder, C16914a timestampProvider, f inAppInternal, e9.c<C16008a, d> displayedIamRepository, C16739d webViewProvider) {
        Intrinsics.j(concurrentHandlerHolder, "concurrentHandlerHolder");
        Intrinsics.j(timestampProvider, "timestampProvider");
        Intrinsics.j(inAppInternal, "inAppInternal");
        Intrinsics.j(displayedIamRepository, "displayedIamRepository");
        Intrinsics.j(webViewProvider, "webViewProvider");
        this.concurrentHandlerHolder = concurrentHandlerHolder;
        this.timestampProvider = timestampProvider;
        this.inAppInternal = inAppInternal;
        this.displayedIamRepository = displayedIamRepository;
        this.webViewProvider = webViewProvider;
    }

    private List<InterfaceC15126a> a() {
        return CollectionsKt.p(new C15128c(this.concurrentHandlerHolder, this.displayedIamRepository, this.timestampProvider), new e(this.concurrentHandlerHolder, this.inAppInternal));
    }

    public IamDialog b(String campaignId, String sid, String url, String requestId) {
        Intrinsics.j(campaignId, "campaignId");
        IamDialog iamDialog = new IamDialog(this.timestampProvider, this.webViewProvider);
        Bundle bundle = new Bundle();
        bundle.putString(PreferencesHelper.PREF_ID, campaignId);
        bundle.putString("sid", sid);
        bundle.putString("url", url);
        bundle.putString("request_id", requestId);
        iamDialog.setArguments(bundle);
        iamDialog.J0(a());
        return iamDialog;
    }
}
