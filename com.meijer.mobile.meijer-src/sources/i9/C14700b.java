package i9;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Li9/b;", "", "", "tableName", "Li9/c;", "triggerType", "Li9/a;", "triggerEvent", "<init>", "(Ljava/lang/String;Li9/c;Li9/a;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ljava/lang/String;", "getTableName", "()Ljava/lang/String;", "b", "Li9/c;", "getTriggerType", "()Li9/c;", "c", "Li9/a;", "getTriggerEvent", "()Li9/a;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: i9.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14700b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String tableName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final EnumC14701c triggerType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final EnumC14699a triggerEvent;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && Intrinsics.e(C14700b.class, other.getClass())) {
            C14700b c14700b = (C14700b) other;
            if (Intrinsics.e(this.tableName, c14700b.tableName) && this.triggerType == c14700b.triggerType && this.triggerEvent == c14700b.triggerEvent) {
                return true;
            }
        }
        return false;
    }

    public C14700b(String tableName, EnumC14701c triggerType, EnumC14699a triggerEvent) {
        Intrinsics.j(tableName, "tableName");
        Intrinsics.j(triggerType, "triggerType");
        Intrinsics.j(triggerEvent, "triggerEvent");
        this.tableName = tableName;
        this.triggerType = triggerType;
        this.triggerEvent = triggerEvent;
    }

    public int hashCode() {
        return (((this.tableName.hashCode() * 31) + this.triggerType.hashCode()) * 31) + this.triggerEvent.hashCode();
    }
}
