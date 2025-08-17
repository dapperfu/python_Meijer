package kotlin;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import b2.C6187h;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C16658p;
import qv.InterfaceC16654n;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0082@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ly1/P;", "Landroid/content/Context;", "context", "Landroid/graphics/Typeface;", "c", "(Ly1/P;Landroid/content/Context;)Landroid/graphics/Typeface;", "d", "(Ly1/P;Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: y1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18133c {

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"y1/c$a", "Lb2/h$e;", "Landroid/graphics/Typeface;", "typeface", "", "g", "(Landroid/graphics/Typeface;)V", "", "reason", "f", "(I)V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: y1.c$a */
    public static final class a extends C6187h.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16654n<Typeface> f170076a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ResourceFont f170077b;

        /* JADX WARN: Multi-variable type inference failed */
        a(InterfaceC16654n<? super Typeface> interfaceC16654n, ResourceFont resourceFont) {
            this.f170076a = interfaceC16654n;
            this.f170077b = resourceFont;
        }

        @Override // b2.C6187h.e
        public void f(int reason) {
            this.f170076a.N(new IllegalStateException("Unable to load font " + this.f170077b + " (reason=" + reason + ')'));
        }

        @Override // b2.C6187h.e
        public void g(Typeface typeface) {
            this.f170076a.resumeWith(Result.b(typeface));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(ResourceFont resourceFont, Context context, Continuation<? super Typeface> continuation) throws Resources.NotFoundException {
        C16658p c16658p = new C16658p(IntrinsicsKt.c(continuation), 1);
        c16658p.C();
        C6187h.j(context, resourceFont.getResId(), new a(c16658p, resourceFont), null);
        Object objV = c16658p.v();
        if (objV == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objV;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Typeface c(ResourceFont resourceFont, Context context) throws Resources.NotFoundException {
        Typeface typefaceH = C6187h.h(context, resourceFont.getResId());
        Intrinsics.g(typefaceH);
        return typefaceH;
    }
}
