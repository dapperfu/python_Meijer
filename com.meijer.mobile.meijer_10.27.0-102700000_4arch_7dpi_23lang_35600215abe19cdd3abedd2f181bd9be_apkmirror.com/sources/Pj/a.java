package Pj;

import Bj.p;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.appcompat.app.c;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH$¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u001f\u001a\u0004\u0018\u00010\u00198\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0018\u0010!\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010 R\u0016\u0010#\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\"¨\u0006$"}, d2 = {"LPj/a;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "a", "()Z", "Landroidx/appcompat/app/c$a;", "alertBuilder", "", "c", "(Landroidx/appcompat/app/c$a;)V", "b", "Landroidx/appcompat/app/c;", "g", "()Landroidx/appcompat/app/c;", "", "theme", "f", "(I)LPj/a;", "Landroid/content/Context;", "d", "()Landroid/content/Context;", "Landroid/view/View;", "Landroid/view/View;", "e", "()Landroid/view/View;", "setCustomView", "(Landroid/view/View;)V", "customView", "Landroidx/appcompat/app/c;", "alertDialog", "I", "dialogTheme", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private View customView;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private androidx.appcompat.app.c alertDialog;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int dialogTheme;

    protected void b(c.a alertBuilder) {
        Intrinsics.j(alertBuilder, "alertBuilder");
    }

    protected abstract void c(c.a alertBuilder);

    public a(Context context) {
        Intrinsics.j(context, "context");
        this.context = context;
        this.dialogTheme = p.f3057a;
    }

    private final boolean a() {
        Context context = this.context;
        return (context instanceof Activity) && !((Activity) context).isFinishing();
    }

    /* renamed from: d, reason: from getter */
    protected final Context getContext() {
        return this.context;
    }

    /* renamed from: e, reason: from getter */
    protected final View getCustomView() {
        return this.customView;
    }

    public a f(int theme) {
        this.dialogTheme = theme;
        return this;
    }

    public final androidx.appcompat.app.c g() {
        Object objB;
        Object obj = null;
        if (!a()) {
            return null;
        }
        c.a aVar = new c.a(this.context, this.dialogTheme);
        c(aVar);
        b(aVar);
        try {
            Result.Companion companion = Result.INSTANCE;
            androidx.appcompat.app.c cVarCreate = aVar.create();
            cVarCreate.show();
            this.alertDialog = cVarCreate;
            objB = Result.b(cVarCreate);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objB = Result.b(ResultKt.a(th2));
        }
        Throwable thE = Result.e(objB);
        if (thE != null) {
            uw.a.INSTANCE.e(thE);
        }
        if (!Result.g(objB)) {
            obj = objB;
        }
        return (androidx.appcompat.app.c) obj;
    }
}
