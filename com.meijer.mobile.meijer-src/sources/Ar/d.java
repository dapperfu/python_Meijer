package Ar;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.E;
import androidx.compose.runtime.F;
import androidx.compose.runtime.J;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ek.C13807c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import m5.InterfaceC15666e;

@Metadata(d1 = {"\u0000*\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a'\u0010\u0004\u001a\u00020\u00032\u0016\u0010\u0002\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0000\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0007\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\n\u001a\u00020\t2\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"", "", "urls", "", "e", "([Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "", "d", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "Landroid/content/Context;", "context", "j", "(Landroid/content/Context;Ljava/util/List;)Ljava/util/List;", "key", "", "i", "(Landroid/content/Context;Ljava/lang/String;)Z", "common_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class d {

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ar/d$a", "Landroidx/compose/runtime/E;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a implements E {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f2009a;

        public a(List list) {
            this.f2009a = list;
        }

        @Override // androidx.compose.runtime.E
        public void dispose() {
            for (InterfaceC15666e interfaceC15666e : this.f2009a) {
                if (!interfaceC15666e.isDisposed()) {
                    interfaceC15666e.dispose();
                }
            }
        }
    }

    public static final void d(final List<String> urls, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(urls, "urls");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1102050351);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.D(urls) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1102050351, i11, -1, "com.meijer.mobile.ui.common.coil.PrefetchImagesEffect (PrefetchImagesEffect.kt:37)");
            }
            final Context context = (Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g());
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zD = composerStartRestartGroup.D(context) | composerStartRestartGroup.D(urls);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Ar.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return d.g(context, urls, (F) obj);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            J.c(urls, (Function1) objB, composerStartRestartGroup, i11 & 14);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Ar.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return d.h(urls, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void e(final String[] urls, Composer composer, final int i10) {
        Intrinsics.j(urls, "urls");
        Composer composerStartRestartGroup = composer.startRestartGroup(1311498282);
        composerStartRestartGroup.startMovableGroup(1924434142, Integer.valueOf(urls.length));
        int i11 = (composerStartRestartGroup.d(urls.length) ? 4 : 0) | i10;
        for (String str : urls) {
            i11 |= composerStartRestartGroup.V(str) ? 4 : 0;
        }
        composerStartRestartGroup.T();
        if ((i11 & 14) == 0) {
            i11 |= 2;
        }
        if ((i11 & 3) == 2 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1311498282, i11, -1, "com.meijer.mobile.ui.common.coil.PrefetchImagesEffect (PrefetchImagesEffect.kt:23)");
            }
            d(ArraysKt.h1(urls), composerStartRestartGroup, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Ar.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return d.f(urls, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(String[] strArr, int i10, Composer composer, int i11) {
        e(strArr, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final E g(Context context, List list, F DisposableEffect) {
        Intrinsics.j(DisposableEffect, "$this$DisposableEffect");
        List<String> listJ = j(context, list);
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listJ, 10));
        Iterator<T> it = listJ.iterator();
        while (it.hasNext()) {
            arrayList.add(a5.a.a(context).d(C13807c.f130207a.d(context, (String) it.next())));
        }
        return new a(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(List list, int i10, Composer composer, int i11) {
        d(list, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    private static final List<String> j(Context context, List<String> list) {
        List listP0 = CollectionsKt.p0(list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listP0) {
            if (!i(context, (String) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final boolean i(android.content.Context r5, java.lang.String r6) {
        /*
            a5.h r5 = a5.a.a(r5)
            e5.a r5 = r5.a()
            r0 = 0
            if (r5 == 0) goto L10
            e5.a$c r5 = r5.b(r6)
            goto L11
        L10:
            r5 = r0
        L11:
            if (r5 == 0) goto L20
            gw.B r6 = r5.getData()     // Catch: java.lang.Throwable -> L1e
            if (r6 == 0) goto L20
            java.io.File r6 = r6.toFile()     // Catch: java.lang.Throwable -> L1e
            goto L21
        L1e:
            r6 = move-exception
            goto L74
        L20:
            r6 = r0
        L21:
            qw.a$a r1 = qw.a.INSTANCE     // Catch: java.lang.Throwable -> L1e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1e
            r2.<init>()     // Catch: java.lang.Throwable -> L1e
            java.lang.String r3 = "Image cache'"
            r2.append(r3)     // Catch: java.lang.Throwable -> L1e
            if (r6 == 0) goto L34
            java.lang.String r3 = r6.getName()     // Catch: java.lang.Throwable -> L1e
            goto L35
        L34:
            r3 = r0
        L35:
            r2.append(r3)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r3 = "' exists "
            r2.append(r3)     // Catch: java.lang.Throwable -> L1e
            if (r6 == 0) goto L48
            boolean r3 = r6.exists()     // Catch: java.lang.Throwable -> L1e
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L1e
            goto L49
        L48:
            r3 = r0
        L49:
            r2.append(r3)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r3 = " with length "
            r2.append(r3)     // Catch: java.lang.Throwable -> L1e
            if (r6 == 0) goto L5c
            long r3 = r6.length()     // Catch: java.lang.Throwable -> L1e
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L1e
            goto L5d
        L5c:
            r3 = r0
        L5d:
            r2.append(r3)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L1e
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L1e
            r1.q(r2, r4)     // Catch: java.lang.Throwable -> L1e
            if (r6 == 0) goto L70
            boolean r3 = r6.exists()     // Catch: java.lang.Throwable -> L1e
        L70:
            kotlin.io.CloseableKt.a(r5, r0)
            return r3
        L74:
            throw r6     // Catch: java.lang.Throwable -> L75
        L75:
            r0 = move-exception
            kotlin.io.CloseableKt.a(r5, r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Ar.d.i(android.content.Context, java.lang.String):boolean");
    }
}
