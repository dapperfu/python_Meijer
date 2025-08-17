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
    public byte f138735a;

    /* renamed from: b, reason: collision with root package name */
    public Object f138736b;

    public A() {
    }

    public A(byte b10, Object obj) {
        this.f138735a = b10;
        this.f138736b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b10 = this.f138735a;
        Object obj = this.f138736b;
        objectOutput.writeByte(b10);
        switch (b10) {
            case 1:
                objectOutput.writeUTF(((AbstractC14782a) obj).getId());
                return;
            case 2:
                C14786e c14786e = (C14786e) obj;
                objectOutput.writeObject(c14786e.f138746a);
                objectOutput.writeObject(c14786e.f138747b);
                return;
            case 3:
                i iVar = (i) obj;
                objectOutput.writeObject(iVar.f138755a);
                objectOutput.writeObject(iVar.f138756b);
                objectOutput.writeObject(iVar.f138757c);
                return;
            case 4:
                t tVar = (t) obj;
                tVar.getClass();
                objectOutput.writeInt(tVar.get(ChronoField.YEAR));
                objectOutput.writeByte(tVar.get(ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(tVar.get(ChronoField.DAY_OF_MONTH));
                return;
            case 5:
                objectOutput.writeByte(((u) obj).f138785a);
                return;
            case 6:
                n nVar = (n) obj;
                objectOutput.writeObject(nVar.f138770a);
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
                C14787f c14787f = (C14787f) obj;
                objectOutput.writeUTF(c14787f.f138749a.getId());
                objectOutput.writeInt(c14787f.f138750b);
                objectOutput.writeInt(c14787f.f138751c);
                objectOutput.writeInt(c14787f.f138752d);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Object objOf;
        byte b10 = objectInput.readByte();
        this.f138735a = b10;
        switch (b10) {
            case 1:
                ConcurrentHashMap concurrentHashMap = AbstractC14782a.f138742a;
                objOf = Chronology.of(objectInput.readUTF());
                break;
            case 2:
                objOf = ((ChronoLocalDate) objectInput.readObject()).T((LocalTime) objectInput.readObject());
                break;
            case 3:
                objOf = ((ChronoLocalDateTime) objectInput.readObject()).N((ZoneOffset) objectInput.readObject()).M((ZoneId) objectInput.readObject());
                break;
            case 4:
                LocalDate localDate = t.f138779d;
                int i10 = objectInput.readInt();
                byte b11 = objectInput.readByte();
                byte b12 = objectInput.readByte();
                r.f138777c.getClass();
                objOf = new t(LocalDate.of(i10, b11, b12));
                break;
            case 5:
                u uVar = u.f138783d;
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
                w.f138789c.getClass();
                objOf = new y(LocalDate.of(i12 + 1911, b15, b16));
                break;
            case 8:
                int i13 = objectInput.readInt();
                byte b17 = objectInput.readByte();
                byte b18 = objectInput.readByte();
                C.f138738c.getClass();
                objOf = new E(LocalDate.of(i13 - 543, b17, b18));
                break;
            case 9:
                int i14 = C14787f.f138748e;
                objOf = new C14787f(Chronology.of(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.f138736b = objOf;
    }

    private Object readResolve() {
        return this.f138736b;
    }
}
