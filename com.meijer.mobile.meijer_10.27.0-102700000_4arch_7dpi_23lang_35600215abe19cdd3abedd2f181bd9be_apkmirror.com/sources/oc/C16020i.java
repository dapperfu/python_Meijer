package oc;

import L0.k;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "initialPage", "Loc/g;", "a", "(ILandroidx/compose/runtime/Composer;II)Loc/g;", "pager_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: oc.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16020i {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loc/g;", "c", "()Loc/g;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: oc.i$a */
    static final class a extends Lambda implements Function0<PagerState> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f153376f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10) {
            super(0);
            this.f153376f = i10;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final PagerState invoke() {
            return new PagerState(this.f153376f);
        }
    }

    @Deprecated
    public static final PagerState a(int i10, Composer composer, int i11, int i12) {
        composer.startReplaceableGroup(1352421093);
        boolean z10 = true;
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if (ComposerKt.M()) {
            ComposerKt.U(1352421093, i11, -1, "com.google.accompanist.pager.rememberPagerState (PagerState.kt:66)");
        }
        Object[] objArr = new Object[0];
        k<PagerState, ?> kVarA = PagerState.INSTANCE.a();
        composer.startReplaceableGroup(-1078956111);
        if ((((i11 & 14) ^ 6) <= 4 || !composer.d(i10)) && (i11 & 6) != 4) {
            z10 = false;
        }
        Object objB = composer.B();
        if (z10 || objB == Composer.INSTANCE.a()) {
            objB = new a(i10);
            composer.t(objB);
        }
        composer.U();
        PagerState pagerState = (PagerState) L0.c.c(objArr, kVarA, null, (Function0) objB, composer, 72, 4);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.U();
        return pagerState;
    }
}
