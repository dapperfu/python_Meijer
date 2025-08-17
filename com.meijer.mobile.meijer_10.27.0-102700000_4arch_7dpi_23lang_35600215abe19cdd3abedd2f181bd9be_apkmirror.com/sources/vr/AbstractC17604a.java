package vr;

import Ir.UserActionDialogInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ur.AbstractC17302a;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lvr/a;", "", "<init>", "()V", "a", "Lvr/a$a;", "cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: vr.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC17604a {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lvr/a$a;", "Lvr/a;", "LIr/a;", "Lur/a;", "chokingDialogInfo", "<init>", "(LIr/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIr/a;", "()LIr/a;", "cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vr.a$a, reason: collision with other inner class name and from toString */
    public static final /* data */ class ChokingHazardChallenge extends AbstractC17604a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final UserActionDialogInfo<AbstractC17302a> chokingDialogInfo;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ChokingHazardChallenge) && Intrinsics.e(this.chokingDialogInfo, ((ChokingHazardChallenge) other).chokingDialogInfo);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChokingHazardChallenge(UserActionDialogInfo<AbstractC17302a> chokingDialogInfo) {
            super(null);
            Intrinsics.j(chokingDialogInfo, "chokingDialogInfo");
            this.chokingDialogInfo = chokingDialogInfo;
        }

        public final UserActionDialogInfo<AbstractC17302a> a() {
            return this.chokingDialogInfo;
        }

        public int hashCode() {
            return this.chokingDialogInfo.hashCode();
        }

        public String toString() {
            return "ChokingHazardChallenge(chokingDialogInfo=" + this.chokingDialogInfo + ')';
        }
    }

    public /* synthetic */ AbstractC17604a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC17604a() {
    }
}
