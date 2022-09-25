package corp.fantastic.project.adapters.database.common;

import corp.fantastic.project.adapters.common.model.exceptions.CommonAdaptersModelExceptions;

public class PassAsDependencyIsInOtherCommon {
    public void error() throws CommonAdaptersModelExceptions {
        throw new CommonAdaptersModelExceptions();
    };
}
