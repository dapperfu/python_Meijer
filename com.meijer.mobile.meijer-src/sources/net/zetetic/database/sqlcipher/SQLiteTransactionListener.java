package net.zetetic.database.sqlcipher;

/* loaded from: classes14.dex */
public interface SQLiteTransactionListener {
    void onBegin();

    void onCommit();

    void onRollback();
}
