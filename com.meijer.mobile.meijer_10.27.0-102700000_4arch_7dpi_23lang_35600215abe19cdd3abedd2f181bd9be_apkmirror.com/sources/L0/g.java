package L0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"LL0/e;", "a", "(Landroidx/compose/runtime/Composer;I)LL0/e;", "runtime-saveable_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class g {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LL0/f;", "c", "()LL0/f;"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function0<f> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f17610f = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final f invoke() {
            return new f(null, 1, null);
        }
    }

    public static final e a(Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(15454635, i10, -1, "androidx.compose.runtime.saveable.rememberSaveableStateHolder (SaveableStateHolder.kt:56)");
        }
        composer.startReplaceGroup(-796079677);
        f fVar = (f) c.c(new Object[0], f.INSTANCE.a(), null, a.f17610f, composer, 3072, 4);
        fVar.k((h) composer.o(j.e()));
        composer.P();
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return fVar;
    }
}
