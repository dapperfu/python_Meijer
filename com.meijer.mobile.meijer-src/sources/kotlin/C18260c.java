package kotlin;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import b2.C6327h;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15819p;
import mv.InterfaceC15815n;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0082@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ly1/P;", "Landroid/content/Context;", "context", "Landroid/graphics/Typeface;", "c", "(Ly1/P;Landroid/content/Context;)Landroid/graphics/Typeface;", "d", "(Ly1/P;Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: y1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18260c {

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"y1/c$a", "Lb2/h$e;", "Landroid/graphics/Typeface;", "typeface", "", "g", "(Landroid/graphics/Typeface;)V", "", "reason", "f", "(I)V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: y1.c$a */
    public static final class a extends C6327h.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC15815n<Typeface> f171102a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ResourceFont f171103b;

        /* JADX WARN: Multi-variable type inference failed */
        a(InterfaceC15815n<? super Typeface> interfaceC15815n, ResourceFont resourceFont) {
            this.f171102a = interfaceC15815n;
            this.f171103b = resourceFont;
        }

        @Override // b2.C6327h.e
        public void f(int reason) {
            this.f171102a.N(new IllegalStateException("Unable to load font " + this.f171103b + " (reason=" + reason + ')'));
        }

        @Override // b2.C6327h.e
        public void g(Typeface typeface) {
            this.f171102a.resumeWith(Result.b(typeface));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(ResourceFont resourceFont, Context context, Continuation<? super Typeface> continuation) throws Resources.NotFoundException {
        C15819p c15819p = new C15819p(IntrinsicsKt.c(continuation), 1);
        c15819p.C();
        C6327h.j(context, resourceFont.getResId(), new a(c15819p, resourceFont), null);
        Object objU = c15819p.u();
        if (objU == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objU;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Typeface c(ResourceFont resourceFont, Context context) throws Resources.NotFoundException {
        Typeface typefaceH = C6327h.h(context, resourceFont.getResId());
        Intrinsics.g(typefaceH);
        return typefaceH;
    }
}
