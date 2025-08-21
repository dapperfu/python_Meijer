package Ja;

import Ha.e;
import k9.InterfaceC15112a;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \f2\u00020\u0001:\u0001\fR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"LJa/a;", "Lk9/a;", "LHa/e;", "e", "()LHa/e;", "predictInternal", "N", "loggingPredictInternal", "Ljava/lang/Runnable;", "o", "()Ljava/lang/Runnable;", "predictShardTrigger", "a", "predict_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface a extends InterfaceC15112a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f15680a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\u0005\u0010\t¨\u0006\u000b"}, d2 = {"LJa/a$a;", "", "<init>", "()V", "LJa/a;", "b", "LJa/a;", "a", "()LJa/a;", "(LJa/a;)V", "instance", "predict_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ja.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f15680a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static a instance;

        public final a a() {
            return instance;
        }

        public final void b(a aVar) {
            instance = aVar;
        }

        private Companion() {
        }
    }

    e N();

    e e();

    Runnable o();
}
