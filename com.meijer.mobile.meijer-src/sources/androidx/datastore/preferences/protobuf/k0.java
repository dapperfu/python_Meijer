package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
final class k0 {

    class a implements b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC6083g f54527a;

        a(AbstractC6083g abstractC6083g) {
            this.f54527a = abstractC6083g;
        }

        @Override // androidx.datastore.preferences.protobuf.k0.b
        public byte a(int i10) {
            return this.f54527a.e(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.k0.b
        public int size() {
            return this.f54527a.size();
        }
    }

    private interface b {
        byte a(int i10);

        int size();
    }

    static String a(AbstractC6083g abstractC6083g) {
        return b(new a(abstractC6083g));
    }

    static String b(b bVar) {
        StringBuilder sb2 = new StringBuilder(bVar.size());
        for (int i10 = 0; i10 < bVar.size(); i10++) {
            byte bA = bVar.a(i10);
            if (bA == 34) {
                sb2.append("\\\"");
            } else if (bA == 39) {
                sb2.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((bA >>> 6) & 3) + 48));
                            sb2.append((char) (((bA >>> 3) & 7) + 48));
                            sb2.append((char) ((bA & 7) + 48));
                            break;
                        } else {
                            sb2.append((char) bA);
                            break;
                        }
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    static String c(String str) {
        return a(AbstractC6083g.m(str));
    }
}
