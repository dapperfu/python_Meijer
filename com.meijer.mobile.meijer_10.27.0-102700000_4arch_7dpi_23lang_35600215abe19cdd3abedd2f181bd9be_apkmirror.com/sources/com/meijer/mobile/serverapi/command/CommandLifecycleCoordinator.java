package com.meijer.mobile.serverapi.command;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import uw.a;

/* loaded from: classes11.dex */
public class CommandLifecycleCoordinator extends Fragment {
    private static final String COMMAND_MANAGER_KEY = "Meijer.Command.Manager";
    private final List<Command> commandList = new ArrayList();

    public static synchronized void bindCommand(FragmentActivity fragmentActivity, Command command) {
        CommandLifecycleCoordinator commandManagerForActivity = getCommandManagerForActivity(fragmentActivity);
        if (commandManagerForActivity != null) {
            commandManagerForActivity.addCommand(command);
        }
    }

    private static CommandLifecycleCoordinator getCommandManagerForActivity(FragmentActivity fragmentActivity) {
        String str = fragmentActivity.getClass().getName() + COMMAND_MANAGER_KEY;
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        Fragment fragmentFindFragmentByTag = supportFragmentManager.findFragmentByTag(str);
        if (fragmentFindFragmentByTag == null) {
            fragmentFindFragmentByTag = new CommandLifecycleCoordinator();
            try {
                supportFragmentManager.beginTransaction().e(fragmentFindFragmentByTag, str).h();
                supportFragmentManager.executePendingTransactions();
                a.d("Adding ActivityCommandManager '%s [%s]'.", str, Integer.valueOf(fragmentFindFragmentByTag.hashCode()));
            } catch (IllegalStateException unused) {
                a.d("Exception adding ActivityCommandManager. Activity must be paused", new Object[0]);
                return null;
            }
        }
        return (CommandLifecycleCoordinator) fragmentFindFragmentByTag;
    }

    public static synchronized void unBindCommand(FragmentActivity fragmentActivity, Command command) {
        CommandLifecycleCoordinator commandManagerForActivity = getCommandManagerForActivity(fragmentActivity);
        if (commandManagerForActivity != null) {
            commandManagerForActivity.removeCommand(command);
        }
    }

    private void addCommand(Command command) {
        a.d("Binding command %s", command.getClass().getName());
        if (!this.commandList.contains(command)) {
            this.commandList.add(command);
        }
    }

    private void removeCommand(Command command) {
        a.d("Unbinding command %s", command.getClass().getName());
        this.commandList.remove(command);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        a.d("### Fragment [%s] has been PAUSED. Canceling %d commands for this activity ###", Integer.valueOf(hashCode()), Integer.valueOf(this.commandList.size()));
        Iterator<Command> it = this.commandList.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
        this.commandList.clear();
    }
}
