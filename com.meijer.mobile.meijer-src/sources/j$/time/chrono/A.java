package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class A implements Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;

    /* renamed from: a, reason: collision with root package name */
    public byte f139325a;

    /* renamed from: b, reason: collision with root package name */
    public Object f139326b;

    public A() {
    }

    public A(byte b10, Object obj) {
        this.f139325a = b10;
        this.f139326b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b10 = this.f139325a;
        Object obj = this.f139326b;
        objectOutput.writeByte(b10);
        switch (b10) {
            case 1:
                objectOutput.writeUTF(((AbstractC14870a) obj).getId());
                return;
            case 2:
                C14874e c14874e = (C14874e) obj;
                objectOutput.writeObject(c14874e.f139336a);
                objectOutput.writeObject(c14874e.f139337b);
                return;
            case 3:
                i iVar = (i) obj;
                objectOutput.writeObject(iVar.f139345a);
                objectOutput.writeObject(iVar.f139346b);
                objectOutput.writeObject(iVar.f139347c);
                return;
            case 4:
                t tVar = (t) obj;
                tVar.getClass();
                objectOutput.writeInt(tVar.get(ChronoField.YEAR));
                objectOutput.writeByte(tVar.get(ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(tVar.get(ChronoField.DAY_OF_MONTH));
                return;
            case 5:
                objectOutput.writeByte(((u) obj).f139375a);
                return;
            case 6:
                n nVar = (n) obj;
                objectOutput.writeObject(nVar.f139360a);
                objectOutput.writeInt(nVar.get(ChronoField.YEAR));
                objectOutput.writeByte(nVar.get(ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(nVar.get(ChronoField.DAY_OF_MONTH));
                return;
            case 7:
                y yVar = (y) obj;
                yVar.getClass();
                objectOutput.writeInt(yVar.get(ChronoField.YEAR));
                objectOutput.writeByte(yVar.get(ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(yVar.get(ChronoField.DAY_OF_MONTH));
                return;
            case 8:
                E e10 = (E) obj;
                e10.getClass();
                objectOutput.writeInt(e10.get(ChronoField.YEAR));
                objectOutput.writeByte(e10.get(ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(e10.get(ChronoField.DAY_OF_MONTH));
                return;
            case 9:
                C14875f c14875f = (C14875f) obj;
                objectOutput.writeUTF(c14875f.f139339a.getId());
                objectOutput.writeInt(c14875f.f139340b);
                objectOutput.writeInt(c14875f.f139341c);
                objectOutput.writeInt(c14875f.f139342d);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Object objOf;
        byte b10 = objectInput.readByte();
        this.f139325a = b10;
        switch (b10) {
            case 1:
                ConcurrentHashMap concurrentHashMap = AbstractC14870a.f139332a;
                objOf = Chronology.of(objectInput.readUTF());
                break;
            case 2:
                objOf = ((ChronoLocalDate) objectInput.readObject()).T((LocalTime) objectInput.readObject());
                break;
            case 3:
                objOf = ((ChronoLocalDateTime) objectInput.readObject()).N((ZoneOffset) objectInput.readObject()).M((ZoneId) objectInput.readObject());
                break;
            case 4:
                LocalDate localDate = t.f139369d;
                int i10 = objectInput.readInt();
                byte b11 = objectInput.readByte();
                byte b12 = objectInput.readByte();
                r.f139367c.getClass();
                objOf = new t(LocalDate.of(i10, b11, b12));
                break;
            case 5:
                u uVar = u.f139373d;
                objOf = u.q(objectInput.readByte());
                break;
            case 6:
                l lVar = (l) objectInput.readObject();
                int i11 = objectInput.readInt();
                byte b13 = objectInput.readByte();
                byte b14 = objectInput.readByte();
                lVar.getClass();
                objOf = new n(lVar, i11, b13, b14);
                break;
            case 7:
                int i12 = objectInput.readInt();
                byte b15 = objectInput.readByte();
                byte b16 = objectInput.readByte();
                w.f139379c.getClass();
                objOf = new y(LocalDate.of(i12 + 1911, b15, b16));
                break;
            case 8:
                int i13 = objectInput.readInt();
                byte b17 = objectInput.readByte();
                byte b18 = objectInput.readByte();
                C.f139328c.getClass();
                objOf = new E(LocalDate.of(i13 - 543, b17, b18));
                break;
            case 9:
                int i14 = C14875f.f139338e;
                objOf = new C14875f(Chronology.of(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.f139326b = objOf;
    }

    private Object readResolve() {
        return this.f139326b;
    }
}
