package com.google.firebase.perf.config;

import Td.InterfaceC5228f;
import Td.InterfaceC5229g;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Keep
/* loaded from: classes7.dex */
public class RemoteConfigManager {
    private static final long FETCH_NEVER_HAPPENED_TIMESTAMP_MS = 0;
    private static final String FIREPERF_FRC_NAMESPACE_NAME = "fireperf";
    private static final long MIN_APP_START_CONFIG_FETCH_DELAY_MS = 5000;
    private static final int RANDOM_APP_START_CONFIG_FETCH_DELAY_MS = 25000;
    private final ConcurrentHashMap<String, dg.j> allRcConfigMap;
    private final long appStartConfigFetchDelayInMs;
    private final long appStartTimeInMs;
    private final x cache;
    private final Executor executor;
    private com.google.firebase.remoteconfig.a firebaseRemoteConfig;
    private long firebaseRemoteConfigLastFetchTimestampMs;
    private If.b<com.google.firebase.remoteconfig.c> firebaseRemoteConfigProvider;
    private static final Uf.a logger = Uf.a.e();
    private static final RemoteConfigManager instance = new RemoteConfigManager();
    private static final long TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS = TimeUnit.HOURS.toMillis(12);

    @SuppressLint({"ThreadPoolCreation"})
    private RemoteConfigManager() {
        this(x.e(), new ThreadPoolExecutor(0, 1, FETCH_NEVER_HAPPENED_TIMESTAMP_MS, TimeUnit.SECONDS, new LinkedBlockingQueue()), null, new Random().nextInt(RANDOM_APP_START_CONFIG_FETCH_DELAY_MS) + MIN_APP_START_CONFIG_FETCH_DELAY_MS, getInitialStartupMillis());
    }

    public static int getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    public static RemoteConfigManager getInstance() {
        return instance;
    }

    private boolean hasAppStartConfigFetchDelayElapsed(long j10) {
        return j10 - this.appStartTimeInMs >= this.appStartConfigFetchDelayInMs;
    }

    private boolean hasLastFetchBecomeStale(long j10) {
        return j10 - this.firebaseRemoteConfigLastFetchTimestampMs > TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS;
    }

    public ag.g<Boolean> getBoolean(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config boolean value is null.");
            return ag.g.a();
        }
        dg.j remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return ag.g.e(Boolean.valueOf(remoteConfigValue.asBoolean()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.asString().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.asString(), str);
                }
            }
        }
        return ag.g.a();
    }

    public ag.g<Double> getDouble(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config double value is null.");
            return ag.g.a();
        }
        dg.j remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return ag.g.e(Double.valueOf(remoteConfigValue.i()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.asString().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.asString(), str);
                }
            }
        }
        return ag.g.a();
    }

    public ag.g<Long> getLong(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config long value is null.");
            return ag.g.a();
        }
        dg.j remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return ag.g.e(Long.valueOf(remoteConfigValue.h()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.asString().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.asString(), str);
                }
            }
        }
        return ag.g.a();
    }

    public ag.g<String> getString(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config String value is null.");
            return ag.g.a();
        }
        dg.j remoteConfigValue = getRemoteConfigValue(str);
        return remoteConfigValue != null ? ag.g.e(remoteConfigValue.asString()) : ag.g.a();
    }

    public boolean isFirebaseRemoteConfigAvailable() {
        If.b<com.google.firebase.remoteconfig.c> bVar;
        com.google.firebase.remoteconfig.c cVar;
        if (this.firebaseRemoteConfig == null && (bVar = this.firebaseRemoteConfigProvider) != null && (cVar = bVar.get()) != null) {
            this.firebaseRemoteConfig = cVar.e(FIREPERF_FRC_NAMESPACE_NAME);
        }
        return this.firebaseRemoteConfig != null;
    }

    public boolean isLastFetchFailed() {
        com.google.firebase.remoteconfig.a aVar = this.firebaseRemoteConfig;
        return aVar == null || aVar.i().a() == 1 || this.firebaseRemoteConfig.i().a() == 2;
    }

    public void setFirebaseRemoteConfigProvider(If.b<com.google.firebase.remoteconfig.c> bVar) {
        this.firebaseRemoteConfigProvider = bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void syncConfigValues(Map<String, dg.j> map) {
        this.allRcConfigMap.putAll(map);
        for (String str : this.allRcConfigMap.keySet()) {
            if (!map.containsKey(str)) {
                this.allRcConfigMap.remove(str);
            }
        }
        d dVarE = d.e();
        dg.j jVar = this.allRcConfigMap.get(dVarE.c());
        if (jVar == null) {
            logger.a("ExperimentTTID remote config flag does not exist.");
            return;
        }
        try {
            this.cache.l(dVarE.a(), jVar.asBoolean());
        } catch (Exception unused) {
            logger.a("ExperimentTTID remote config flag has invalid value, expected boolean.");
        }
    }

    public static /* synthetic */ void a(RemoteConfigManager remoteConfigManager, Exception exc) {
        remoteConfigManager.getClass();
        logger.k("Call to Remote Config failed: %s. This may cause a degraded experience with Firebase Performance. Please reach out to Firebase Support https://firebase.google.com/support/", exc);
        remoteConfigManager.firebaseRemoteConfigLastFetchTimestampMs = FETCH_NEVER_HAPPENED_TIMESTAMP_MS;
    }

    static long getInitialStartupMillis() {
        com.google.firebase.n nVar;
        try {
            nVar = (com.google.firebase.n) com.google.firebase.f.l().j(com.google.firebase.n.class);
        } catch (IllegalStateException unused) {
            logger.a("Unable to get StartupTime instance.");
            nVar = null;
        }
        if (nVar != null) {
            return nVar.c();
        }
        return System.currentTimeMillis();
    }

    private dg.j getRemoteConfigValue(String str) {
        triggerRemoteConfigFetchIfNecessary();
        if (isFirebaseRemoteConfigAvailable() && this.allRcConfigMap.containsKey(str)) {
            dg.j jVar = this.allRcConfigMap.get(str);
            if (jVar.g() == 2) {
                logger.b("Fetched value: '%s' for key: '%s' from Firebase Remote Config.", jVar.asString(), str);
                return jVar;
            }
            return null;
        }
        return null;
    }

    private boolean shouldFetchAndActivateRemoteConfigValues() {
        long currentSystemTimeMillis = getCurrentSystemTimeMillis();
        if (hasAppStartConfigFetchDelayElapsed(currentSystemTimeMillis) && hasLastFetchBecomeStale(currentSystemTimeMillis)) {
            return true;
        }
        return false;
    }

    private void triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch() {
        this.firebaseRemoteConfigLastFetchTimestampMs = getCurrentSystemTimeMillis();
        this.firebaseRemoteConfig.g().h(this.executor, new InterfaceC5229g() { // from class: com.google.firebase.perf.config.y
            @Override // Td.InterfaceC5229g
            public final void onSuccess(Object obj) {
                RemoteConfigManager remoteConfigManager = this.f89044a;
                remoteConfigManager.syncConfigValues(remoteConfigManager.firebaseRemoteConfig.h());
            }
        }).f(this.executor, new InterfaceC5228f() { // from class: com.google.firebase.perf.config.z
            @Override // Td.InterfaceC5228f
            public final void onFailure(Exception exc) {
                RemoteConfigManager.a(this.f89045a, exc);
            }
        });
    }

    private void triggerRemoteConfigFetchIfNecessary() {
        if (isFirebaseRemoteConfigAvailable()) {
            if (this.allRcConfigMap.isEmpty()) {
                this.allRcConfigMap.putAll(this.firebaseRemoteConfig.h());
            }
            if (shouldFetchAndActivateRemoteConfigValues()) {
                triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch();
            }
        }
    }

    protected long getCurrentSystemTimeMillis() {
        return System.currentTimeMillis();
    }

    public <T> T getRemoteConfigValueOrDefault(String str, T t10) {
        dg.j remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                if (t10 instanceof Boolean) {
                    return (T) Boolean.valueOf(remoteConfigValue.asBoolean());
                }
                if (t10 instanceof Double) {
                    return (T) Double.valueOf(remoteConfigValue.i());
                }
                if (!(t10 instanceof Long) && !(t10 instanceof Integer)) {
                    if (t10 instanceof String) {
                        return (T) remoteConfigValue.asString();
                    }
                    T t11 = (T) remoteConfigValue.asString();
                    try {
                        logger.b("No matching type found for the defaultValue: '%s', using String.", t10);
                        return t11;
                    } catch (IllegalArgumentException unused) {
                        t10 = t11;
                        if (!remoteConfigValue.asString().isEmpty()) {
                            logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.asString(), str);
                        }
                        return t10;
                    }
                }
                return (T) Long.valueOf(remoteConfigValue.h());
            } catch (IllegalArgumentException unused2) {
            }
        }
        return t10;
    }

    RemoteConfigManager(x xVar, Executor executor, com.google.firebase.remoteconfig.a aVar, long j10, long j11) {
        ConcurrentHashMap<String, dg.j> concurrentHashMap;
        this.firebaseRemoteConfigLastFetchTimestampMs = FETCH_NEVER_HAPPENED_TIMESTAMP_MS;
        this.cache = xVar;
        this.executor = executor;
        this.firebaseRemoteConfig = aVar;
        if (aVar == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap = new ConcurrentHashMap<>(aVar.h());
        }
        this.allRcConfigMap = concurrentHashMap;
        this.appStartTimeInMs = j11;
        this.appStartConfigFetchDelayInMs = j10;
    }
}
