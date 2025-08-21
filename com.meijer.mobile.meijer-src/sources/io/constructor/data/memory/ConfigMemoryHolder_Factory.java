package io.constructor.data.memory;

import xu.InterfaceC18226d;

/* loaded from: classes6.dex */
public final class ConfigMemoryHolder_Factory implements InterfaceC18226d {

    private static final class InstanceHolder {
        private static final ConfigMemoryHolder_Factory INSTANCE = new ConfigMemoryHolder_Factory();

        private InstanceHolder() {
        }
    }

    public static ConfigMemoryHolder newInstance() {
        return new ConfigMemoryHolder();
    }

    @Override // gv.InterfaceC14411a
    public ConfigMemoryHolder get() {
        return newInstance();
    }

    public static ConfigMemoryHolder_Factory create() {
        return InstanceHolder.INSTANCE;
    }
}
