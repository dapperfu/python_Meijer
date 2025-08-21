package qf;

/* loaded from: classes8.dex */
public interface L {

    public static abstract class a {
        public abstract String c();

        public abstract String d();

        public abstract String e();

        static a a(String str, FirebaseInstallationId j10) {
            return new C16643c(str, j10.getFid(), j10.getAuthToken());
        }

        public static a b(String str) {
            return new C16643c(str, null, null);
        }
    }

    a a();
}
