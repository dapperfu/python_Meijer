package com.scandit.datacapture.barcode.find.capture;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/scandit/datacapture/barcode/find/capture/KeyableByteArray;", "", "", "bytes", "<init>", "([B)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "[B", "getBytes", "()[B", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class KeyableByteArray {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final byte[] bytes;

    public KeyableByteArray(byte[] bytes) {
        Intrinsics.j(bytes, "bytes");
        this.bytes = bytes;
    }

    public boolean equals(Object other) {
        if (this != other) {
            return (other instanceof KeyableByteArray) && Arrays.equals(this.bytes, ((KeyableByteArray) other).bytes);
        }
        return true;
    }

    public final byte[] getBytes() {
        return this.bytes;
    }

    public int hashCode() {
        return Arrays.hashCode(this.bytes);
    }

    public String toString() {
        String string = Arrays.toString(this.bytes);
        Intrinsics.i(string, "toString(...)");
        return string;
    }
}
