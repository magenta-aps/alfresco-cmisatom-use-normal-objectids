package dk.magenta.cmisatom;

import org.alfresco.opencmis.CMISConnector;
import org.alfresco.service.cmr.repository.AssociationRef;
import org.alfresco.service.cmr.repository.NodeRef;

/**
 * Created by syastrov on 11/10/15.
 *
 * Always drop the store refs (e.g. "workspace://SpacesStore/") from the CMIS
 * objectIds. This is to allow the /alfresco/cmisatom endpoint to function
 * similar to the "public API" CMIS endpoints.
 */
public class MyCMISConnector extends CMISConnector {
    @Override
    public String constructObjectId(AssociationRef assocRef, String versionLabel, boolean dropStoreRef) {
        return super.constructObjectId(assocRef, versionLabel, true);
    }

    @Override
    public String constructObjectId(String incomingNodeId, String versionLabel, boolean dropStoreRef) {
        return super.constructObjectId(incomingNodeId, versionLabel, true);
    }

    @Override
    public String constructObjectId(NodeRef incomingNodeRef, String versionLabel, boolean dropStoreRef) {
        return super.constructObjectId(incomingNodeRef, versionLabel, true);
    }

    @Override
    public String createObjectId(NodeRef nodeRef, boolean dropStoreRef) {
        return super.createObjectId(nodeRef, true);
    }

    @Override
    public String getRepositoryId() {
        return super.getRepositoryId();
    }
}
