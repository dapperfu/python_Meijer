package com.scandit.datacapture.core.common.feedback;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/scandit/datacapture/core/common/feedback/WaveFormVibration;", "Lcom/scandit/datacapture/core/common/feedback/Vibration;", "", "timings", "", "amplitudes", "<init>", "([J[I)V", "", "toJson", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "c", "[J", "getTimings", "()[J", "d", "[I", "getAmplitudes", "()[I", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class WaveFormVibration extends Vibration {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long[] timings;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int[] amplitudes;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public WaveFormVibration(long[] timings) {
        this(timings, null, 2, 0 == true ? 1 : 0);
        Intrinsics.j(timings, "timings");
    }

    @Override // com.scandit.datacapture.core.common.feedback.Vibration
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WaveFormVibration)) {
            return false;
        }
        WaveFormVibration waveFormVibration = (WaveFormVibration) other;
        return Arrays.equals(this.timings, waveFormVibration.timings) && Arrays.equals(this.amplitudes, waveFormVibration.amplitudes);
    }

    public /* synthetic */ WaveFormVibration(long[] jArr, int[] iArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(jArr, (i10 & 2) != 0 ? null : iArr);
    }

    public final int[] getAmplitudes() {
        return this.amplitudes;
    }

    public final long[] getTimings() {
        return this.timings;
    }

    @Override // com.scandit.datacapture.core.common.feedback.Vibration
    public int hashCode() {
        int iHashCode = this.timings.hashCode() * 31;
        int[] iArr = this.amplitudes;
        return iHashCode + (iArr != null ? iArr.hashCode() : 0);
    }

    @Override // com.scandit.datacapture.core.common.feedback.Vibration
    public String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "waveForm");
        jSONObject.put("timings", new JSONArray(this.timings));
        int[] iArr = this.amplitudes;
        if (iArr != null) {
            jSONObject.put("amplitudes", new JSONArray(iArr));
        }
        String string = jSONObject.toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }

    @JvmOverloads
    public WaveFormVibration(long[] timings, int[] iArr) {
        Intrinsics.j(timings, "timings");
        this.timings = timings;
        this.amplitudes = iArr;
    }
}
