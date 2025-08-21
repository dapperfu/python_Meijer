package j$.time;

import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class q extends ZoneId {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f139508d = 0;
    private static final long serialVersionUID = 8386373296231747096L;

    /* renamed from: b, reason: collision with root package name */
    public final String f139509b;

    /* renamed from: c, reason: collision with root package name */
    public final transient j$.time.zone.f f139510c;

    public static q i0(String str, boolean z10) {
        j$.time.zone.f fVarA;
        Objects.requireNonNull(str, "zoneId");
        int length = str.length();
        if (length >= 2) {
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                if ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt != '/' || i10 == 0) && ((cCharAt < '0' || cCharAt > '9' || i10 == 0) && ((cCharAt != '~' || i10 == 0) && ((cCharAt != '.' || i10 == 0) && ((cCharAt != '_' || i10 == 0) && ((cCharAt != '+' || i10 == 0) && (cCharAt != '-' || i10 == 0))))))))) {
                    throw new DateTimeException("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
                }
            }
            try {
                fVarA = j$.time.zone.i.a(str);
            } catch (j$.time.zone.g e10) {
                if (z10) {
                    throw e10;
                }
                fVarA = null;
            }
            return new q(str, fVarA);
        }
        throw new DateTimeException("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
    }

    public q(String str, j$.time.zone.f fVar) {
        this.f139509b = str;
        this.f139510c = fVar;
    }

    @Override // j$.time.ZoneId
    public final String getId() {
        return this.f139509b;
    }

    @Override // j$.time.ZoneId
    public final j$.time.zone.f H() {
        j$.time.zone.f fVar = this.f139510c;
        return fVar != null ? fVar : j$.time.zone.i.a(this.f139509b);
    }

    private Object writeReplace() {
        return new n((byte) 7, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.ZoneId
    public final void f0(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(7);
        dataOutput.writeUTF(this.f139509b);
    }
}
