package Ij;

import com.medallia.digital.mobilesdk.l3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u001a\b\u0007\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0010\u001a\u0004\b\u001e\u0010\u0012R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u001f\u0010\u0012R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\u001a¨\u0006!"}, d2 = {"LIj/d;", "", "", "title", "description", "acceptLabel", "Lkotlin/Function0;", "", "onAccept", "onCancel", "subTitle", "cancelLabel", "onDismiss", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "a", "Ljava/lang/String;", "n", "()Ljava/lang/String;", "b", "i", "c", "g", "d", "Lkotlin/jvm/functions/Function0;", "j", "()Lkotlin/jvm/functions/Function0;", "e", "k", "f", "m", "h", "l", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class d {

    /* renamed from: i, reason: collision with root package name */
    public static final int f14809i = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String title;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String description;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String acceptLabel;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> onAccept;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> onCancel;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String subTitle;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String cancelLabel;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> onDismiss;

    public d() {
        this(null, null, null, null, null, null, null, null, l3.f93323c, null);
    }

    public d(String str, String str2, String str3, Function0<Unit> onAccept, Function0<Unit> onCancel, String str4, String str5, Function0<Unit> onDismiss) {
        Intrinsics.j(onAccept, "onAccept");
        Intrinsics.j(onCancel, "onCancel");
        Intrinsics.j(onDismiss, "onDismiss");
        this.title = str;
        this.description = str2;
        this.acceptLabel = str3;
        this.onAccept = onAccept;
        this.onCancel = onCancel;
        this.subTitle = str4;
        this.cancelLabel = str5;
        this.onDismiss = onDismiss;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f() {
        return Unit.f143329a;
    }

    /* renamed from: g, reason: from getter */
    public final String getAcceptLabel() {
        return this.acceptLabel;
    }

    /* renamed from: h, reason: from getter */
    public final String getCancelLabel() {
        return this.cancelLabel;
    }

    /* renamed from: i, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final Function0<Unit> j() {
        return this.onAccept;
    }

    public final Function0<Unit> k() {
        return this.onCancel;
    }

    public final Function0<Unit> l() {
        return this.onDismiss;
    }

    /* renamed from: m, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    /* renamed from: n, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public /* synthetic */ d(String str, String str2, String str3, Function0 function0, Function0 function02, String str4, String str5, Function0 function03, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? new Function0() { // from class: Ij.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d.d();
            }
        } : function0, (i10 & 16) != 0 ? new Function0() { // from class: Ij.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d.e();
            }
        } : function02, (i10 & 32) != 0 ? null : str4, (i10 & 64) != 0 ? null : str5, (i10 & 128) != 0 ? new Function0() { // from class: Ij.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d.f();
            }
        } : function03);
    }
}
