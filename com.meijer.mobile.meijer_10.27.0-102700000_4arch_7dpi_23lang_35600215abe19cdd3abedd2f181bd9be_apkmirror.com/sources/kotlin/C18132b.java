package kotlin;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import kotlin.C18151u;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\n \r*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u000e\u0010\u0012¨\u0006\u0014"}, d2 = {"Ly1/b;", "Ly1/I;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Ly1/k;", "font", "Landroid/graphics/Typeface;", "d", "(Ly1/k;)Landroid/graphics/Typeface;", "b", "(Ly1/k;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlin.jvm.PlatformType", "a", "Landroid/content/Context;", "", "Ljava/lang/Object;", "()Ljava/lang/Object;", "cacheKey", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: y1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18132b implements InterfaceC18115I {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object cacheKey;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.text.font.AndroidFontLoader", f = "AndroidFontLoader.android.kt", l = {55, 57}, m = "awaitLoad")
    /* renamed from: y1.b$a */
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f170071a;

        /* renamed from: b, reason: collision with root package name */
        Object f170072b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f170073c;

        /* renamed from: e, reason: collision with root package name */
        int f170075e;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f170073c = obj;
            this.f170075e |= Integer.MIN_VALUE;
            return C18132b.this.b(null, this);
        }
    }

    @Override // kotlin.InterfaceC18115I
    /* renamed from: a, reason: from getter */
    public Object getCacheKey() {
        return this.cacheKey;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlin.InterfaceC18115I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(kotlin.InterfaceC18141k r6, kotlin.coroutines.Continuation<? super android.graphics.Typeface> r7) throws android.content.res.Resources.NotFoundException {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlin.C18132b.a
            if (r0 == 0) goto L13
            r0 = r7
            y1.b$a r0 = (kotlin.C18132b.a) r0
            int r1 = r0.f170075e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f170075e = r1
            goto L18
        L13:
            y1.b$a r0 = new y1.b$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f170073c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f170075e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r6 = r0.f170072b
            y1.k r6 = (kotlin.InterfaceC18141k) r6
            java.lang.Object r0 = r0.f170071a
            y1.b r0 = (kotlin.C18132b) r0
            kotlin.ResultKt.b(r7)
            goto L5e
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            kotlin.ResultKt.b(r7)
            return r7
        L40:
            kotlin.ResultKt.b(r7)
            boolean r7 = r6 instanceof kotlin.AbstractC18131a
            if (r7 != 0) goto L84
            boolean r7 = r6 instanceof kotlin.ResourceFont
            if (r7 == 0) goto L6d
            r7 = r6
            y1.P r7 = (kotlin.ResourceFont) r7
            android.content.Context r2 = r5.context
            r0.f170071a = r5
            r0.f170072b = r6
            r0.f170075e = r3
            java.lang.Object r7 = kotlin.C18133c.b(r7, r2, r0)
            if (r7 != r1) goto L5d
            return r1
        L5d:
            r0 = r5
        L5e:
            android.graphics.Typeface r7 = (android.graphics.Typeface) r7
            y1.P r6 = (kotlin.ResourceFont) r6
            y1.A r6 = r6.getVariationSettings()
            android.content.Context r0 = r0.context
            android.graphics.Typeface r6 = kotlin.C18121O.c(r7, r6, r0)
            return r6
        L6d:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown font type: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        L84:
            y1.a r6 = (kotlin.AbstractC18131a) r6
            r6.d()
            r0.f170075e = r4
            r6 = 0
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C18132b.b(y1.k, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlin.InterfaceC18115I
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Typeface c(InterfaceC18141k font) throws Resources.NotFoundException {
        Object objB;
        Typeface typefaceC;
        if (font instanceof AbstractC18131a) {
            ((AbstractC18131a) font).d();
            throw null;
        }
        if (!(font instanceof ResourceFont)) {
            return null;
        }
        int loadingStrategy = font.getLoadingStrategy();
        C18151u.Companion companion = C18151u.INSTANCE;
        if (C18151u.e(loadingStrategy, companion.b())) {
            typefaceC = C18133c.c((ResourceFont) font, this.context);
        } else {
            if (!C18151u.e(loadingStrategy, companion.c())) {
                if (C18151u.e(loadingStrategy, companion.a())) {
                    throw new UnsupportedOperationException("Unsupported Async font load path");
                }
                throw new IllegalArgumentException("Unknown loading type " + ((Object) C18151u.g(font.getLoadingStrategy())));
            }
            try {
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(C18133c.c((ResourceFont) font, this.context));
            } catch (Throwable th2) {
                Result.Companion companion3 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(th2));
            }
            typefaceC = (Typeface) (Result.g(objB) ? null : objB);
        }
        return C18121O.c(typefaceC, ((ResourceFont) font).getVariationSettings(), this.context);
    }

    public C18132b(Context context) {
        this.context = context.getApplicationContext();
    }
}
