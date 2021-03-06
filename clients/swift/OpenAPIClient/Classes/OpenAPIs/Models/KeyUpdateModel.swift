//
// KeyUpdateModel.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public class KeyUpdateModel: JSONEncodable {
    public var implementation: AnyObject?
    public var manifest: AnyObject?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["implementation"] = self.implementation?.encodeToJSON()
        nillableDictionary["manifest"] = self.manifest?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
