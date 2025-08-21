package ka;

import L9.InAppLoadingTime;
import android.app.Activity;
import androidx.fragment.app.FragmentManager;
import com.emarsys.mobileengage.iam.dialog.IamDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import oa.InAppMetaData;
import r9.C16875b;
import ta.InterfaceC17215f;
import u9.C17361a;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJO\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020!8\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\"¨\u0006$"}, d2 = {"Lka/l;", "", "Ln9/b;", "concurrentHandlerHolder", "Lla/c;", "dialogProvider", "Lu9/a;", "timestampProvider", "LT8/i;", "currentActivityWatchdog", "<init>", "(Ln9/b;Lla/c;Lu9/a;LT8/i;)V", "", "campaignId", "sid", "url", "requestId", "", "startTimestamp", "html", "Lta/f;", "messageLoadedListener", "", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Lta/f;)V", "a", "Ln9/b;", "b", "Lla/c;", "c", "Lu9/a;", "d", "LT8/i;", "", "Z", "showingInProgress", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public class l {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final n9.b concurrentHandlerHolder;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final la.c dialogProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C17361a timestampProvider;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final T8.i currentActivityWatchdog;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean showingInProgress;

    public l(n9.b concurrentHandlerHolder, la.c dialogProvider, C17361a timestampProvider, T8.i currentActivityWatchdog) {
        Intrinsics.j(concurrentHandlerHolder, "concurrentHandlerHolder");
        Intrinsics.j(dialogProvider, "dialogProvider");
        Intrinsics.j(timestampProvider, "timestampProvider");
        Intrinsics.j(currentActivityWatchdog, "currentActivityWatchdog");
        this.concurrentHandlerHolder = concurrentHandlerHolder;
        this.dialogProvider = dialogProvider;
        this.timestampProvider = timestampProvider;
        this.currentActivityWatchdog = currentActivityWatchdog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(final l lVar, String str, String str2, String str3, String str4, String str5, final long j10, final InterfaceC17215f interfaceC17215f) {
        try {
            final IamDialog iamDialogB = lVar.dialogProvider.b(str, str2, str3, str4);
            final Activity activityD = lVar.currentActivityWatchdog.d();
            iamDialogB.F0(str5, new InAppMetaData(str, str2, str3), new InterfaceC17215f() { // from class: ka.i
                @Override // ta.InterfaceC17215f
                public final void a() {
                    l.g(activityD, lVar, iamDialogB, j10, interfaceC17215f);
                }
            }, activityD);
        } catch (Exception e10) {
            lVar.concurrentHandlerHolder.getCoreHandler().b(new Runnable() { // from class: ka.j
                @Override // java.lang.Runnable
                public final void run() {
                    l.i(e10, interfaceC17215f, lVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(InterfaceC17215f interfaceC17215f, l lVar) {
        if (interfaceC17215f != null) {
            interfaceC17215f.a();
        }
        lVar.showingInProgress = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void i(Exception exc, InterfaceC17215f interfaceC17215f, l lVar) {
        K9.e.INSTANCE.c(new L9.b(exc, null, 2, 0 == true ? 1 : 0));
        if (interfaceC17215f != null) {
            interfaceC17215f.a();
        }
        lVar.showingInProgress = false;
    }

    public void e(final String campaignId, final String sid, final String url, final String requestId, final long startTimestamp, final String html, final InterfaceC17215f messageLoadedListener) {
        Intrinsics.j(campaignId, "campaignId");
        Intrinsics.j(html, "html");
        FragmentManager fragmentManagerA = C16875b.a(this.currentActivityWatchdog.d());
        if ((fragmentManagerA != null ? fragmentManagerA.findFragmentByTag("MOBILE_ENGAGE_IAM_DIALOG_TAG") : null) == null && !this.showingInProgress) {
            this.showingInProgress = true;
            this.concurrentHandlerHolder.h(new Runnable() { // from class: ka.h
                @Override // java.lang.Runnable
                public final void run() {
                    l.f(this.f141721a, campaignId, sid, url, requestId, html, startTimestamp, messageLoadedListener);
                }
            });
        } else if (messageLoadedListener != null) {
            messageLoadedListener.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Activity activity, final l lVar, IamDialog iamDialog, long j10, final InterfaceC17215f interfaceC17215f) {
        FragmentManager fragmentManagerA = C16875b.a(activity);
        if (fragmentManagerA != null && fragmentManagerA.findFragmentByTag("MOBILE_ENGAGE_IAM_DIALOG_TAG") == null) {
            iamDialog.L0(new InAppLoadingTime(j10, lVar.timestampProvider.a()));
            if (!fragmentManagerA.isStateSaved()) {
                iamDialog.showNow(fragmentManagerA, "MOBILE_ENGAGE_IAM_DIALOG_TAG");
            }
        }
        lVar.concurrentHandlerHolder.getCoreHandler().b(new Runnable() { // from class: ka.k
            @Override // java.lang.Runnable
            public final void run() {
                l.h(interfaceC17215f, lVar);
            }
        });
    }
}
