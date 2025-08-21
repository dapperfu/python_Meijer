package Qj;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.c;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B-\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00042\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u0006\"\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001b\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u0015\u0010!\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0004¢\u0006\u0004\b!\u0010\u0015J\u001f\u0010#\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b#\u0010\u001aJ\r\u0010$\u001a\u00020\u0000¢\u0006\u0004\b$\u0010\u001eJ\u0017\u0010'\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020%H\u0014¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020%H\u0014¢\u0006\u0004\b)\u0010(R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00103\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010,R\u0016\u00105\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010/¨\u00066"}, d2 = {"LQj/m;", "LQj/j;", "Landroid/content/Context;", "context", "", "messageResourceId", "", "", "messageFormatArgs", "<init>", "(Landroid/content/Context;I[Ljava/lang/String;)V", "", "H", "()V", "titleResourceId", "", "titleFormatArgs", "G", "(I[Ljava/lang/Object;)LQj/m;", "theme", "F", "(I)LQj/m;", "confirmButtonResourceId", "Landroid/content/DialogInterface$OnClickListener;", "confirmListener", "D", "(ILandroid/content/DialogInterface$OnClickListener;)LQj/m;", "E", "(Landroid/content/DialogInterface$OnClickListener;)LQj/m;", "A", "()LQj/m;", "z", "cancelButtonResourceId", "B", "cancelListener", "C", "y", "Landroidx/appcompat/app/c$a;", "alertBuilder", "c", "(Landroidx/appcompat/app/c$a;)V", "b", "", "r", "Z", "cancelButtonConfigured", "s", "I", "t", "Landroid/content/DialogInterface$OnClickListener;", "u", "finishOnCancel", "v", "cancelFinishResultCode", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class m extends j {

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean cancelButtonConfigured;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private int cancelButtonResourceId;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private DialogInterface.OnClickListener cancelListener;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private boolean finishOnCancel;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private int cancelFinishResultCode;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(DialogInterface.OnClickListener onClickListener, DialogInterface dialogInterface) {
        onClickListener.onClick(dialogInterface, -2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, int i10, String... messageFormatArgs) {
        super(context, i10, Arrays.copyOf(messageFormatArgs, messageFormatArgs.length));
        Intrinsics.j(context, "context");
        Intrinsics.j(messageFormatArgs, "messageFormatArgs");
        this.cancelButtonResourceId = R.string.cancel;
    }

    private final void H() {
        if (this.cancelButtonConfigured) {
            throw new IllegalStateException("Cannot configure cancelButton / cancelListener multiple times; this is a developer error!");
        }
        this.cancelButtonConfigured = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(m mVar, DialogInterface dialogInterface, int i10) {
        if (mVar.cancelFinishResultCode != 0) {
            ((Activity) mVar.getContext()).setResult(mVar.cancelFinishResultCode);
        }
        ((Activity) mVar.getContext()).finish();
    }

    @Override // Qj.j
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public m r(int titleResourceId, Object... titleFormatArgs) {
        Intrinsics.j(titleFormatArgs, "titleFormatArgs");
        j jVarR = super.r(titleResourceId, Arrays.copyOf(titleFormatArgs, titleFormatArgs.length));
        Intrinsics.h(jVarR, "null cannot be cast to non-null type com.meijer.mobile.core.design.widget.alert.SimpleOkCancelAlert");
        return (m) jVarR;
    }

    @Override // Qj.j, Qj.a
    protected void b(c.a alertBuilder) {
        Intrinsics.j(alertBuilder, "alertBuilder");
        final DialogInterface.OnClickListener onClickListener = this.cancelListener;
        if (onClickListener != null) {
            if (!getCancelable()) {
                onClickListener = null;
            }
            if (onClickListener != null) {
                alertBuilder.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: Qj.k
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        m.w(onClickListener, dialogInterface);
                    }
                });
            }
        }
    }

    @Override // Qj.j, Qj.a
    protected void c(c.a alertBuilder) {
        Intrinsics.j(alertBuilder, "alertBuilder");
        super.c(alertBuilder);
        if (this.cancelListener != null && this.finishOnCancel) {
            throw new IllegalStateException("Cannot register cancelListener and enable finishOnCancel; call finish() in cancelListener instead");
        }
        if (this.finishOnCancel && (getContext() instanceof Activity)) {
            this.cancelListener = new DialogInterface.OnClickListener() { // from class: Qj.l
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    m.x(this.f31017a, dialogInterface, i10);
                }
            };
        }
        alertBuilder.setNegativeButton(this.cancelButtonResourceId, this.cancelListener);
    }

    @Override // Qj.j
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public m n() {
        j jVarN = super.n();
        Intrinsics.h(jVarN, "null cannot be cast to non-null type com.meijer.mobile.core.design.widget.alert.SimpleOkCancelAlert");
        return (m) jVarN;
    }

    public final m B(int cancelButtonResourceId) {
        H();
        this.cancelButtonResourceId = cancelButtonResourceId;
        return this;
    }

    public final m C(int cancelButtonResourceId, DialogInterface.OnClickListener cancelListener) {
        H();
        this.cancelButtonResourceId = cancelButtonResourceId;
        this.cancelListener = cancelListener;
        return this;
    }

    @Override // Qj.j
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public m o(int confirmButtonResourceId, DialogInterface.OnClickListener confirmListener) {
        j jVarO = super.o(confirmButtonResourceId, confirmListener);
        Intrinsics.h(jVarO, "null cannot be cast to non-null type com.meijer.mobile.core.design.widget.alert.SimpleOkCancelAlert");
        return (m) jVarO;
    }

    public m E(DialogInterface.OnClickListener confirmListener) {
        j jVarP = super.p(confirmListener);
        Intrinsics.h(jVarP, "null cannot be cast to non-null type com.meijer.mobile.core.design.widget.alert.SimpleOkCancelAlert");
        return (m) jVarP;
    }

    @Override // Qj.a
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public m f(int theme) {
        a aVarF = super.f(theme);
        Intrinsics.h(aVarF, "null cannot be cast to non-null type com.meijer.mobile.core.design.widget.alert.SimpleOkCancelAlert");
        return (m) aVarF;
    }

    public final m y() {
        t();
        this.finishOnCancel = true;
        return this;
    }

    @Override // Qj.j
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public m l() {
        j jVarL = super.l();
        Intrinsics.h(jVarL, "null cannot be cast to non-null type com.meijer.mobile.core.design.widget.alert.SimpleOkCancelAlert");
        return (m) jVarL;
    }
}
