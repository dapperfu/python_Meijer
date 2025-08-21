package com.bugsnag.android;

import com.bugsnag.android.C6624v0;
import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\b*\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\b*\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/bugsnag/android/p1;", "Lcom/bugsnag/android/v0$a;", "Ljava/util/UUID;", "traceId", "", "spanId", "<init>", "(Ljava/util/UUID;J)V", "", "b", "(Ljava/util/UUID;)Ljava/lang/String;", "a", "(J)Ljava/lang/String;", "Lcom/bugsnag/android/v0;", "writer", "", "toStream", "(Lcom/bugsnag/android/v0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getTraceId", "()Ljava/util/UUID;", "J", "getSpanId", "()J", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.bugsnag.android.p1, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class TraceCorrelation implements C6624v0.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final UUID traceId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long spanId;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TraceCorrelation)) {
            return false;
        }
        TraceCorrelation traceCorrelation = (TraceCorrelation) other;
        return Intrinsics.e(this.traceId, traceCorrelation.traceId) && this.spanId == traceCorrelation.spanId;
    }

    public int hashCode() {
        return (this.traceId.hashCode() * 31) + Long.hashCode(this.spanId);
    }

    public String toString() {
        return "TraceCorrelation(traceId=" + this.traceId + ", spanId=" + this.spanId + ')';
    }

    public TraceCorrelation(UUID uuid, long j10) {
        this.traceId = uuid;
        this.spanId = j10;
    }

    private final String a(long j10) {
        String str = String.format("%016x", Arrays.copyOf(new Object[]{Long.valueOf(j10)}, 1));
        Intrinsics.i(str, "format(this, *args)");
        return str;
    }

    private final String b(UUID uuid) {
        String str = String.format("%016x%016x", Arrays.copyOf(new Object[]{Long.valueOf(uuid.getMostSignificantBits()), Long.valueOf(uuid.getLeastSignificantBits())}, 2));
        Intrinsics.i(str, "format(this, *args)");
        return str;
    }

    @Override // com.bugsnag.android.C6624v0.a
    public void toStream(C6624v0 writer) throws IOException {
        writer.d().l("traceId").O(b(this.traceId)).l("spanId").O(a(this.spanId));
        writer.i();
    }
}
