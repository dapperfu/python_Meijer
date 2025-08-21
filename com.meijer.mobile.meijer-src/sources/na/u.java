package na;

import android.content.ClipboardManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import pa.ButtonClicked;
import r9.C16874a;
import u9.C17361a;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u009b\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rj\u0004\u0018\u0001`\u000f\u0012@\u0010\u0019\u001a<\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0011j\u0004\u0018\u0001`\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010!R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010&\u001a\u0004\b\"\u0010'R\u0014\u0010\b\u001a\u00020\u00078\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b \u0010(R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\"\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rj\u0004\u0018\u0001`\u000f8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b+\u0010,RN\u0010\u0019\u001a<\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0011j\u0004\u0018\u0001`\u00188\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u001b\u001a\u00020\u001a8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u001d\u001a\u00020\u001c8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00063"}, d2 = {"Lna/u;", "", "Lna/s;", "Lr9/a;", "currentActivityProvider", "Ln9/b;", "concurrentHandlerHolder", "Lka/f;", "inAppInternal", "Lg9/c;", "Lpa/a;", "Lg9/d;", "buttonClickedRepository", "Lkotlin/Function0;", "", "Lcom/emarsys/mobileengage/iam/jsbridge/OnCloseListener;", "onCloseTriggered", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "property", "Lorg/json/JSONObject;", "json", "Lcom/emarsys/mobileengage/iam/jsbridge/OnAppEventListener;", "onAppEventTriggered", "Lu9/a;", "timestampProvider", "Landroid/content/ClipboardManager;", "clipboardManager", "<init>", "(Lr9/a;Ln9/b;Lka/f;Lg9/c;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lu9/a;Landroid/content/ClipboardManager;)V", "c", "()Lna/s;", "a", "Lr9/a;", "b", "()Lr9/a;", "Ln9/b;", "()Ln9/b;", "Lka/f;", "d", "Lg9/c;", "e", "Lkotlin/jvm/functions/Function0;", "f", "Lkotlin/jvm/functions/Function2;", "g", "Lu9/a;", "h", "Landroid/content/ClipboardManager;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public class u {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C16874a currentActivityProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final n9.b concurrentHandlerHolder;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ka.f inAppInternal;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final g9.c<ButtonClicked, g9.d> buttonClickedRepository;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> onCloseTriggered;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Function2<String, JSONObject, Unit> onAppEventTriggered;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final C17361a timestampProvider;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ClipboardManager clipboardManager;

    /* JADX WARN: Multi-variable type inference failed */
    public u(C16874a currentActivityProvider, n9.b concurrentHandlerHolder, ka.f inAppInternal, g9.c<ButtonClicked, g9.d> buttonClickedRepository, Function0<Unit> function0, Function2<? super String, ? super JSONObject, Unit> function2, C17361a timestampProvider, ClipboardManager clipboardManager) {
        Intrinsics.j(currentActivityProvider, "currentActivityProvider");
        Intrinsics.j(concurrentHandlerHolder, "concurrentHandlerHolder");
        Intrinsics.j(inAppInternal, "inAppInternal");
        Intrinsics.j(buttonClickedRepository, "buttonClickedRepository");
        Intrinsics.j(timestampProvider, "timestampProvider");
        Intrinsics.j(clipboardManager, "clipboardManager");
        this.currentActivityProvider = currentActivityProvider;
        this.concurrentHandlerHolder = concurrentHandlerHolder;
        this.inAppInternal = inAppInternal;
        this.buttonClickedRepository = buttonClickedRepository;
        this.onCloseTriggered = function0;
        this.onAppEventTriggered = function2;
        this.timestampProvider = timestampProvider;
        this.clipboardManager = clipboardManager;
    }

    /* renamed from: a, reason: from getter */
    public n9.b getConcurrentHandlerHolder() {
        return this.concurrentHandlerHolder;
    }

    /* renamed from: b, reason: from getter */
    public C16874a getCurrentActivityProvider() {
        return this.currentActivityProvider;
    }

    public s c() {
        return new s(getCurrentActivityProvider(), getConcurrentHandlerHolder(), this.inAppInternal, this.buttonClickedRepository, this.onCloseTriggered, this.onAppEventTriggered, this.timestampProvider, this.clipboardManager);
    }
}
