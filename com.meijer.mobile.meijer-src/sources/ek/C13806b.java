package ek;

import V0.C5490r0;
import android.content.Context;
import android.widget.ImageView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5926k;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import m5.C15669h;
import m5.InterfaceC15666e;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001am\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0019\u0010\u0017\u001a\u00020\u0016*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018\u001a3\u0010\u001c\u001a\u00020\u0010*\u00020\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001c\u0010\u001d\u001a \u0010 \u001a\u0004\u0018\u00010\u001f*\u00020\u001e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0086@¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "imageUrl", "contentDescription", "placeholderMemoryCacheKey", "Landroidx/compose/ui/layout/k;", "contentScale", "", "isGrayscale", "LP0/e;", "alignment", "LV0/r0;", "colorFilter", "", "alpha", "", "b", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/layout/k;ZLP0/e;LV0/r0;FLandroidx/compose/runtime/Composer;II)V", "Landroid/widget/ImageView;", "Ljava/io/File;", "file", "Lm5/e;", "d", "(Landroid/widget/ImageView;Ljava/io/File;)Lm5/e;", "", "errorImageResource", "placeholderImageResource", "e", "(Landroid/widget/ImageView;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Landroid/content/Context;", "Landroid/graphics/Bitmap;", "g", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "common_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: ek.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C13806b {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.core.image.common.CoilAsyncImageKt$CoilAsyncImage$1$1", f = "CoilAsyncImage.kt", l = {79}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: ek.b$a */
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f130199a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f130200b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C15669h f130201c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, C15669h c15669h, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f130200b = context;
            this.f130201c = c15669h;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f130200b, this.f130201c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f130199a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                a5.h hVarA = a5.a.a(this.f130200b);
                C15669h c15669h = this.f130201c;
                this.f130199a = 1;
                if (hVarA.c(c15669h, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.core.image.common.CoilAsyncImageKt", f = "CoilAsyncImage.kt", l = {139}, m = "loadBitmap")
    /* renamed from: ek.b$b, reason: collision with other inner class name */
    static final class C2048b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f130202a;

        /* renamed from: b, reason: collision with root package name */
        Object f130203b;

        /* renamed from: c, reason: collision with root package name */
        Object f130204c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f130205d;

        /* renamed from: e, reason: collision with root package name */
        int f130206e;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f130205d = obj;
            this.f130206e |= Integer.MIN_VALUE;
            return C13806b.g(null, null, this);
        }

        C2048b(Continuation<? super C2048b> continuation) {
            super(continuation);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(androidx.compose.ui.Modifier r31, final java.lang.String r32, final java.lang.String r33, java.lang.String r34, androidx.compose.ui.layout.InterfaceC5926k r35, boolean r36, P0.e r37, V0.C5490r0 r38, float r39, androidx.compose.runtime.Composer r40, final int r41, final int r42) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ek.C13806b.b(androidx.compose.ui.Modifier, java.lang.String, java.lang.String, java.lang.String, androidx.compose.ui.layout.k, boolean, P0.e, V0.r0, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(Modifier modifier, String str, String str2, String str3, InterfaceC5926k interfaceC5926k, boolean z10, P0.e eVar, C5490r0 c5490r0, float f10, int i10, int i11, Composer composer, int i12) {
        b(modifier, str, str2, str3, interfaceC5926k, z10, eVar, c5490r0, f10, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    public static final InterfaceC15666e d(ImageView imageView, File file) {
        Intrinsics.j(imageView, "<this>");
        Intrinsics.j(file, "file");
        return a5.a.a(imageView.getContext()).d(new C15669h.a(imageView.getContext()).f(file).B(imageView).c());
    }

    public static final void e(ImageView imageView, String str, Integer num, Integer num2) {
        Intrinsics.j(imageView, "<this>");
        a5.h hVarA = a5.a.a(imageView.getContext());
        C15669h.a aVarB = new C15669h.a(imageView.getContext()).f(str).B(imageView);
        C13807c c13807c = C13807c.f130207a;
        Context context = imageView.getContext();
        Intrinsics.i(context, "getContext(...)");
        c13807c.a(context, str, str, num, num2);
        hVarA.d(aVarB.c());
    }

    public static /* synthetic */ void f(ImageView imageView, String str, Integer num, Integer num2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            num = null;
        }
        if ((i10 & 4) != 0) {
            num2 = null;
        }
        e(imageView, str, num, num2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(android.content.Context r4, java.lang.String r5, kotlin.coroutines.Continuation<? super android.graphics.Bitmap> r6) {
        /*
            boolean r0 = r6 instanceof ek.C13806b.C2048b
            if (r0 == 0) goto L13
            r0 = r6
            ek.b$b r0 = (ek.C13806b.C2048b) r0
            int r1 = r0.f130206e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f130206e = r1
            goto L18
        L13:
            ek.b$b r0 = new ek.b$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f130205d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f130206e
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r4 = r0.f130204c
            m5.h r4 = (m5.C15669h) r4
            java.lang.Object r4 = r0.f130203b
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r4 = r0.f130202a
            android.content.Context r4 = (android.content.Context) r4
            kotlin.ResultKt.b(r6)
            goto L65
        L35:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3d:
            kotlin.ResultKt.b(r6)
            m5.h$a r6 = new m5.h$a
            r6.<init>(r4)
            m5.h$a r6 = r6.f(r5)
            r2 = 0
            m5.h$a r6 = r6.b(r2)
            m5.h r6 = r6.c()
            a5.h r2 = a5.a.a(r4)
            r0.f130202a = r4
            r0.f130203b = r5
            r0.f130204c = r6
            r0.f130206e = r3
            java.lang.Object r6 = r2.c(r6, r0)
            if (r6 != r1) goto L65
            return r1
        L65:
            m5.i r6 = (m5.AbstractC15670i) r6
            boolean r4 = r6 instanceof m5.C15677p
            r5 = 0
            if (r4 == 0) goto L81
            m5.p r6 = (m5.C15677p) r6
            android.graphics.drawable.Drawable r4 = r6.getDrawable()
            boolean r6 = r4 instanceof android.graphics.drawable.BitmapDrawable
            if (r6 == 0) goto L79
            android.graphics.drawable.BitmapDrawable r4 = (android.graphics.drawable.BitmapDrawable) r4
            goto L7a
        L79:
            r4 = r5
        L7a:
            if (r4 == 0) goto L81
            android.graphics.Bitmap r4 = r4.getBitmap()
            return r4
        L81:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ek.C13806b.g(android.content.Context, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
