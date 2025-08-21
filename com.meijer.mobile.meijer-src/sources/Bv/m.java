package Bv;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t\u0082\u0001\u0005\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"LBv/m;", "", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "b", "a", "LBv/d;", "LBv/e;", "LBv/m$a;", "LBv/m$b;", "LBv/n;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class m {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LBv/m$a;", "LBv/m;", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends m {

        /* renamed from: a, reason: collision with root package name */
        public static final a f3726a = new a();

        private a() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LBv/m$b;", "LBv/m;", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends m {

        /* renamed from: a, reason: collision with root package name */
        public static final b f3727a = new b();

        private b() {
            super(null);
        }
    }

    public /* synthetic */ m(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private m() {
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public String toString() {
        String strU = Reflection.b(getClass()).u();
        Intrinsics.g(strU);
        return strU;
    }
}
