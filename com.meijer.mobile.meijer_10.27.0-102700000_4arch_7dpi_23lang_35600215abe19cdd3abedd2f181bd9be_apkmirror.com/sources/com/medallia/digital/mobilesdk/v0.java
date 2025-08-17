package com.medallia.digital.mobilesdk;

import android.util.Pair;
import com.medallia.digital.mobilesdk.d7;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes7.dex */
class v0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Long f93159a = 604800000L;

    class a extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f93160a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f93161b;

        a(boolean z10, String str) {
            this.f93160a = z10;
            this.f93161b = str;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            a4.e("Saving local configuration storage, timestamp, clear uuid = " + this.f93160a);
            long jCurrentTimeMillis = System.currentTimeMillis();
            String str = String.format(Locale.US, "%s/%d", "configuration", Long.valueOf(jCurrentTimeMillis));
            d7.b().b(d7.a.LOCAL_CONFIGURATION_TIMESTAMP, jCurrentTimeMillis);
            a4.b("Local configuration timestamp was updated to " + jCurrentTimeMillis);
            g2.a(str, this.f93161b);
        }
    }

    class b extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f93162a;

        b(String str) {
            this.f93162a = str;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            a4.e("Saving local *Property* configuration storage");
            long jCurrentTimeMillis = System.currentTimeMillis();
            String str = String.format(Locale.US, "%s/%d", "configurationPropertyForLocale", Long.valueOf(jCurrentTimeMillis));
            a4.b("Local *Property* configuration timestamp was updated to " + jCurrentTimeMillis);
            g2.a(str, this.f93162a);
        }
    }

    v0() {
    }

    protected static ConfigurationContract a(File file) {
        if (file == null) {
            return null;
        }
        ConfigurationContract configurationContractCreateConfiguration = ModelFactory.getInstance().createConfiguration(g2.e(file));
        File fileD = d();
        if (fileD != null && a(fileD.getName(), file.getName())) {
            PropertyConfigurationContract propertyConfigurationContractCreatePropertyConfiguration = ModelFactory.getInstance().createPropertyConfiguration(g2.e(fileD));
            if (propertyConfigurationContractCreatePropertyConfiguration != null) {
                configurationContractCreateConfiguration.propertyConfiguration = propertyConfigurationContractCreatePropertyConfiguration;
            }
        }
        return configurationContractCreateConfiguration;
    }

    protected static Pair<String, Boolean> b() {
        a4.e("Deleting local *Property* configuration storage");
        return g2.a("configurationPropertyForLocale");
    }

    protected static File c() {
        File fileD = g2.d("configuration");
        if (fileD == null || !fileD.isDirectory() || fileD.listFiles() == null || fileD.listFiles().length <= 0) {
            return null;
        }
        return fileD.listFiles()[0];
    }

    protected static File d() {
        File fileD = g2.d("configurationPropertyForLocale");
        if (fileD == null || !fileD.isDirectory() || fileD.listFiles() == null || fileD.listFiles().length <= 0) {
            return null;
        }
        return fileD.listFiles()[0];
    }

    protected static List<Pair<String, Boolean>> a() {
        return a(true);
    }

    protected static Pair<String, Boolean> b(String str) {
        Pair<String, Boolean> pairB = b();
        new Thread(new b(str)).start();
        return pairB;
    }

    protected static List<Pair<String, Boolean>> a(String str) {
        return a(str, true);
    }

    protected static List<Pair<String, Boolean>> a(String str, boolean z10) {
        List<Pair<String, Boolean>> listA = a(z10);
        new Thread(new a(z10, str)).start();
        return listA;
    }

    protected static List<Pair<String, Boolean>> a(boolean z10) {
        a4.e("Deleting local configuration storage, timestamp, delete uuid = " + z10);
        if (z10) {
            d7.b().b(d7.a.UUID, (String) null);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(b());
        d7.b().b(d7.a.LOCAL_CONFIGURATION_TIMESTAMP, 0L);
        arrayList.add(g2.a("configuration"));
        return arrayList;
    }

    protected static boolean a(ConfigurationContract configurationContract) {
        Long offlineConfigurationExpirationTime = configurationContract.getSdkConfiguration().getMedalliaDigitalBrain().getOfflineConfigurationExpirationTime();
        if (offlineConfigurationExpirationTime == null) {
            offlineConfigurationExpirationTime = f93159a;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        return offlineConfigurationExpirationTime.longValue() < jCurrentTimeMillis - d7.b().a(d7.a.LOCAL_CONFIGURATION_TIMESTAMP, jCurrentTimeMillis);
    }

    protected static boolean a(File file, ConfigurationContract configurationContract) {
        return (configurationContract == null || file == null || configurationContract.getSdkConfiguration() == null || configurationContract.getSdkConfiguration().getMedalliaDigitalBrain() == null) ? false : true;
    }

    private static boolean a(String str, String str2) throws NumberFormatException {
        if (str != null && str2 != null) {
            if (Long.parseLong(str) > Long.parseLong(str2)) {
                return true;
            }
        }
        return false;
    }
}
